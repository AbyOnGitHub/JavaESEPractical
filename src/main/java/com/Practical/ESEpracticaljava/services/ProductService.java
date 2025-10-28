/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Practical.ESEpracticaljava.services;

import com.Practical.ESEpracticaljava.models.Product;
import com.Practical.ESEpracticaljava.repo.ProductData;
import java.io.IOException;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.multipart.MultipartFile;

/**
 *
 * @author abbsw
 */
@Repository
public class ProductService {
    
    @Autowired
    ProductData repo;
    
    public List<Product> getProducts() {
       return repo.findAll();
    }

    public Product getProductById(int id) {
        return repo.findById(id).orElse(null);
    }

    public Product addProduct(Product product, MultipartFile imageFile) throws IOException{
        
        product.setImageName(imageFile.getOriginalFilename());
        product.setImageType(imageFile.getContentType());
        product.setImageData(imageFile.getBytes());
        
        return repo.save(product);
//throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public Product updateProduct(int id, Product product, MultipartFile imageFile) throws IOException{
        
        product.setImageName(imageFile.getOriginalFilename());
        product.setImageType(imageFile.getContentType());
        product.setImageData(imageFile.getBytes());
    
        return repo.save(product);
    }

    public void deleteProduct(int id) {
        repo.deleteById(id);
    }
    
}
