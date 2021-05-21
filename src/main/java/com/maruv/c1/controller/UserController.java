package com.maruv.c1.controller;

import com.maruv.c1.entity.User;
import com.maruv.c1.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService uservice;

    // Get Request mapping to get all users, user by id, user by first name, and user by email

    @GetMapping("/users")
    public List<User> getAllUsers(){
        return uservice.getAllUsers();
    }

    @GetMapping("/userById/{id}")
    public User getUserById(@PathVariable int id){
        return uservice.getUserById(id);
    }

    @GetMapping("/userByName/{fname}")
    public User getUserById(@PathVariable String fname){
        return uservice.getUserByfName(fname);
    }

    @GetMapping("/userByEmail/{email}")
    public User getUserByEmail(@PathVariable String email){
        return uservice.getUserByEmail(email);
    }

    // POST method mapping for posting new user

    @PostMapping("/addUser")
    public User addUser(@RequestBody User user){
        return uservice.saveUser(user);
    }

    // PUT method mapping for updating user information

    @PutMapping("/updateUser")
    public User updateUserInfo(User user){
        return uservice.updateUser(user);
    }

    // DELETE method mapping for deleting a user

    @DeleteMapping("/deleteUser")
    public String deleteUser(User user){
        return uservice.deleteUser(user);
    }
}
