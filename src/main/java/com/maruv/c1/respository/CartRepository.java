package com.maruv.c1.respository;

import com.maruv.c1.entity.Cart;
import com.maruv.c1.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface CartRepository extends JpaRepository<Cart, Integer> {

    @Query("select p " +
            "from CartItem ci " +
            "right join ci.product p " +
            "right join ci.cart c " +
            "where c.cartID = :cid" )
    List<Product> findCartItems(@Param("cid") int cartID);

    @Modifying
    @Transactional
    @Query(value = "insert into CARTITEM(productIDFK, cartIDFK) " +
            "values (:pid, :cid)",
            nativeQuery = true)
    void addProductToCart(@Param("pid") int productID, @Param("cid") int cartID);

    //List<Product> removeProductFromCart(Product product, int cartID);

}