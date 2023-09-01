package com.ecommerce.server.service;

import java.util.List;

import com.ecommerce.server.entity.Product;



public interface ProductService {
	
	public void saveProductDetails(Product product);
	public List<Product> getProductDetails();
	public Product getProductById(int prodId);
	public String deleteById(int prodId);
	public Product updateProduct(Product product);
	
	

}
