package com.examples.Transaction.service;

import com.examples.Transaction.dto.response.UserResponse;
import com.examples.Transaction.entity.User;
import com.examples.Transaction.repository.UserRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserServiceImp implements UserService {
    @Autowired
    private UserRepository repository;
    @Autowired
    private ProducService producService;

    @Autowired
    private ModelMapper modelMapper;

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public UserResponse createUser(UserResponse request) {
        User user = modelMapper.map(request, User.class);
        producService.createProduct();
        try {
            repository.save(user);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return modelMapper.map(user, UserResponse.class);
    }

    public UserResponse updateUser(String id, String firstName) {
        var user = repository.findById(id).orElseThrow();
        user.setFirstName(firstName);
        return modelMapper.map(repository.save(user), UserResponse.class);

    }

    @Override
    public List<UserResponse> getUsers() {
        List<UserResponse> userResponses = repository.findAll().stream().map(user -> modelMapper.map(user, UserResponse.class)).collect(Collectors.toList());
        return userResponses;
    }

    @Override
    @Transactional(propagation = Propagation.NOT_SUPPORTED)
    public void deleteUser(String id) {
        repository.deleteById(id);
    }
}
