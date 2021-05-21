package com.maruv.c1.service;

import com.maruv.c1.entity.Cart;
import com.maruv.c1.entity.User;
import com.maruv.c1.respository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository Urepository;

    public List<User> getAllUsers(){
        return Urepository.findAll();
    }

    public User getUserById(int id){
        return Urepository.findById(id);
    }

    public User getUserByfName(String name){
        return Urepository.findByfName(name);
    }

    public User getUserByEmail(String email){
        return Urepository.findByEmail(email);
    }

    public User saveUser(User user){
        return Urepository.save(user);
    }

    public User updateUser(User user){
        User existingUser = Urepository.findById(user.getUserID());

        assert existingUser != null;
        existingUser.setFName(user.getFName());
        existingUser.setLName(user.getLName());
        existingUser.setEmail(user.getEmail());
        existingUser.setPassword(user.getPassword());

        return Urepository.save(existingUser);
    }

    public String deleteUser(User user) {
        Urepository.delete(user);
        return "User Deleted: " + user.getUserID();
    }
}
