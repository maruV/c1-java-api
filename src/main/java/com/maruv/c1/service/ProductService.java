package com.maruv.c1.service;

import com.maruv.c1.entity.Product;
import com.maruv.c1.respository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    private ProductRepository repository;

    public Product saveProduct(Product product){
        return repository.save(product);
    }

    public List<Product> saveProducts(List<Product> products){
        return repository.saveAll(products);
    }

    public List<Product> getProducts(){
        return repository.findByprodStatusTrue();
    }

    public List<Product> getLockedProducts(){
        return repository.findLockedProducts();
    }

    public Product getProductByID(int id){
        return repository.findById(id).orElse(null);
    }

    public Product getProductByName(String name){
        return repository.findByprodName(name);
    }

    public String deleteProduct(int id){
        repository.deleteById(id);
        return "Product Removed: " + id;
    }

    public Product updateProduct(Product product){
        Product existingProduct = repository.findById(product.getProductID()).orElse(null);

        assert existingProduct != null;
        existingProduct.setProdName(product.getProdName());
        existingProduct.setProdPrice(product.getProdPrice());
        existingProduct.setProdDesc(product.getProdDesc());
        existingProduct.setProdStatus(product.isProdStatus());
        existingProduct.setProdVotes(product.getProdVotes());
        //existingProduct.setProdPicture(product.getProdPicture());

        return repository.save(existingProduct);
    }

}
