package com.leanjava.learnjava.controller;

import com.leanjava.learnjava.dto.request.ApiReponse;
import com.leanjava.learnjava.dto.request.UserCreationRequest;
import com.leanjava.learnjava.dto.request.UserUpdateRequest;
import com.leanjava.learnjava.dto.response.IntrospectResponse;
import com.leanjava.learnjava.dto.response.UserResponse;
import com.leanjava.learnjava.entity.User;
import com.leanjava.learnjava.service.UserService;
import jakarta.validation.Valid;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@RequestMapping("/users")
@Slf4j
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping
    ApiReponse<UserResponse> createUser(@RequestBody @Valid UserCreationRequest request){
        ApiReponse<UserResponse> apiReponse = new ApiReponse<>();
        apiReponse.setResult(userService.createUser(request));
        return apiReponse;
    }
//    @GetMapping
//    List<UserResponse> getUsers(){
//        return userService.getUsers();
//    }
    @GetMapping
    public ApiReponse<List<UserResponse>> getAllUsers(){
        var authentication = SecurityContextHolder.getContext().getAuthentication();
        log.info("Username: {}", authentication.getName());
        authentication.getAuthorities().forEach(grantedAuthority -> log.info(grantedAuthority.getAuthority()));
        return ApiReponse.<List<UserResponse>>builder()
                .result(userService.getUsers())
                .build();
    }
    @GetMapping("/{userId}")
    public UserResponse getUserById(@PathVariable("userId") String id){
        return userService.getUserById(id);
    }

    @PutMapping("/{userId}")
    public UserResponse updateUser(@PathVariable("userId") String uId, @RequestBody UserUpdateRequest request){
        return userService.updateUser(uId,request);
    }

    @DeleteMapping("/{userId}")
    public String deleteUser(@PathVariable("userId") String uId){
        userService.deleteUser(uId);
        return "user delete";
    }
}
