package com.maruv.c1.service;

import com.maruv.c1.entity.Product;
import com.maruv.c1.respository.CartItemRepository;
import com.maruv.c1.respository.CartRepository;
import com.maruv.c1.respository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CartService {

    @Autowired
    private CartRepository cartRepository;

    @Autowired
    private ProductRepository productRepository ;

    @Autowired private CartItemRepository cartItemRepository;

    public List<Product> getCartItems(int cartid) {
        return cartRepository.findCartItems(cartid);
    }

    public String addItemToCart(int productID, int cartID) {
        cartRepository.addProductToCart(productID, cartID);
        return "Product: " + productID + "\n Added to cart: " + cartID;
    }

    /*
    public List<Product> removeItemFromCart(Product product, int cartid){

        return cartRepository.removeProductFromCart(product, cartid);
    }

     */

}
