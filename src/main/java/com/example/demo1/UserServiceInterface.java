package com.example.demo1;

import java.util.List;

public interface UserServiceInterface {

    //create user
    User createUser(User user);

    //update user
    User updateUser(Long id, User user);

    //get user by id
    User getUserById(Long id);

    //delete user by id
    void deleteUserById(Long id);

    //get all users
    List<User> getAllUsers();
    
}
