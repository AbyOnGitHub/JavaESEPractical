/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.Practical.ESEpracticaljava.repo;

import com.Practical.ESEpracticaljava.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author abbsw
 */
public interface ProductData extends JpaRepository <Product,Integer>{
    
}
