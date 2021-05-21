package com.maruv.c1.controller;

import com.maruv.c1.entity.Product;
import com.maruv.c1.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {

    // Adding all the REST endpoints in the product service

    @Autowired
    private ProductService pservice;

    // POST request mapping methods
    // --Add new product and set of new products
    @PostMapping("/addProduct")
    public Product addProduct(@RequestBody Product product) {
        return pservice.saveProduct(product);
    }

    @PostMapping("/addProducts")
    public List<Product> addProducts(@RequestBody List<Product> products){
        return pservice.saveProducts(products);
    }

    // GET Request mapping  methods
    // --Get List of Products and each product by id and name
    @GetMapping("/products")
    public List<Product> findAllProducts(){
        return pservice.getProducts();
    }

    @GetMapping("/productByID/{id}")
    public Product findProductById(@PathVariable int id){
        return pservice.getProductByID(id);
    }

    @GetMapping("/product/{name}")
    public Product findProductByName(@PathVariable String name){
        return pservice.getProductByName(name);
    }

    // Put Request handling methods
    // --Updates Product
    @PutMapping("/updateProduct")
    public Product updateProduct(@RequestBody Product product){
        return pservice.updateProduct(product);
    }

    // Delete Request Handling method
    // Delete product by id
    @DeleteMapping("/deleteProduct/{id}")
    public String deleteProduct(@PathVariable int id)
        {
            return pservice.deleteProduct(id);
        }
}
