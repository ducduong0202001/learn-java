package com.examples.Transaction.service;

import com.examples.Transaction.dto.response.UserResponse;

import java.util.List;

public interface UserService {
     UserResponse createUser(UserResponse request);
    void deleteUser(String id);
    List<UserResponse> getUsers();
}
