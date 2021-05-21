package com.maruv.c1.respository;

import com.maruv.c1.entity.Cart;
import com.maruv.c1.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface UserRepository extends JpaRepository<User, Integer> {

    User findById(int id);

    User findByfName(String fName);

    User findByEmail(String email);

}
