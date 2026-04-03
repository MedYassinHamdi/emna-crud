package com.emnacrud.service;

import com.emnacrud.models.User;

import java.util.List;

public interface UserService {

    User createUser(User user);
    User getUserById(Long id);

    List<User> getAllUsers();
}
