package com.lera.springboot.service;

import com.lera.springboot.models.User;

import java.util.List;

public interface UserService {
    void newUser(User user);
    void deleteUserById(int id);
    List<User> getAllUsers();
    User getUserById(int id);

}
