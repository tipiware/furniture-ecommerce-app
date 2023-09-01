package com.ecommerce.server.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecommerce.server.entity.Product;


public interface ProductRepository extends JpaRepository<Product,Integer> {

}
