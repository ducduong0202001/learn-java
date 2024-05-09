package com.examples.Transaction.controller;

import com.examples.Transaction.dto.response.UserResponse;
import com.examples.Transaction.dto.response.request.ApiReponse;
import com.examples.Transaction.service.UserService;
import jakarta.validation.Valid;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
@Slf4j
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping
    ApiReponse<UserResponse> createUser(@RequestBody @Valid UserResponse request){
        ApiReponse<UserResponse> apiReponse = new ApiReponse<>();
        apiReponse.setResult(userService.createUser(request));
        return apiReponse;
    }
    @GetMapping
    public ApiReponse<List<UserResponse>> getAllUsers(){
        return ApiReponse.<List<UserResponse>>builder()
                .result(userService.getUsers())
                .build();
    }
    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable("id") String id ){
        userService.deleteUser(id);
    }
}
