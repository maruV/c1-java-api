package com.maruv.c1.respository;

import com.maruv.c1.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Integer> {

    Product findByprodName(String name);

    List<Product> findByprodStatusTrue();

    @Query("FROM Product WHERE prodStatus = FALSE")
    List<Product> findLockedProducts();

}
