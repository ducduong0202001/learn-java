package com.leanjava.learnjava.service;

import com.leanjava.learnjava.dto.request.UserCreationRequest;
import com.leanjava.learnjava.dto.request.UserUpdateRequest;
import com.leanjava.learnjava.dto.response.UserResponse;
import com.leanjava.learnjava.entity.User;
import com.leanjava.learnjava.enums.Role;
import com.leanjava.learnjava.exception.AppException;
import com.leanjava.learnjava.exception.ErrCode;
import com.leanjava.learnjava.repository.UserRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserService {
    @Autowired
    private UserRepository repository;
    @Autowired
    private ModelMapper modelMapper;
    @Autowired
    private PasswordEncoder passwordEncoder;
    public UserResponse createUser(UserCreationRequest request) {
        if(repository.existsByUsername(request.getUsername()))
            throw new AppException(ErrCode.USER_EXISTED);

        User user = modelMapper.map(request,User.class);
        user.setPassword(passwordEncoder.encode(request.getPassword()));

        HashSet<String> roles = new HashSet<>();
        roles.add(Role.USER.name());
        user.setRoles(roles);
        return modelMapper.map(repository.save(user),UserResponse.class);
    }
    @PreAuthorize("hasAuthority('ADMIN')")
    public List<UserResponse> getUsers(){
        List<UserResponse> userResponses = repository.findAll().stream().map(user -> modelMapper.map(user,UserResponse.class)).collect(Collectors.toList());
        return userResponses;
    }
    public UserResponse getUserById(String id){
        return modelMapper.map(repository.findById(id).orElseThrow(()-> new RuntimeException("User not found")),UserResponse.class);
    }
    public UserResponse updateUser(String id,UserUpdateRequest request){
        User user = modelMapper.map(getUserById(id),User.class);
        user.setPassword(request.getPassword());
        user.setFirstName(request.getFirstName());
        user.setLastName(request.getLastName());
        user.setDob(request.getDob());

        return modelMapper.map(repository.save(user),UserResponse.class);
    }

    public void deleteUser(String id){
         repository.deleteById(id);
    }
}
