package com.maruv.c1.controller;

import com.maruv.c1.entity.Product;
import com.maruv.c1.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CartController {

    // Cart will be:
    // 1 : created for a user once in a lifetime
    // 2: viewed = view all the products in it
    // 3: updated = add or delete product

    @Autowired
    private CartService cartService;

    // GET request mapping method to view all the products in the cart

    @GetMapping("/viewCart/{cartId}")
    public List<Product> viewCartItems(@PathVariable int cartId){
        return cartService.getCartItems(cartId);
    }

    //POST Mapping methods to add items to the cart

    @PostMapping("/addToCart/{cartID}/{productID}")
    public String addItemsToCart(@PathVariable int productID, @PathVariable int cartID){
        return cartService.addItemToCart(productID, cartID);
    }

    /*
    @PutMapping("/removeFromCart/{cartId}")
    public List<Product> removeCartItem(@RequestBody Product product, @PathVariable int cartId){
        return cartService.removeItemFromCart(product, cartId);
    }

 */

}
