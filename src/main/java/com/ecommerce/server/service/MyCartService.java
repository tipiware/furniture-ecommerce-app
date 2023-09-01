package com.ecommerce.server.service;

import java.util.List;

import com.ecommerce.server.entity.MyCart;


public interface MyCartService {
	
	public void saveMyCartProductDetails(MyCart mycart);
	
	public List<MyCart> getMyCartProductDetails();
	
	public MyCart getMyCartProductById(int myCartId);
	
	public String deleteById(int myCartId);
	
	public MyCart updateMyCart(MyCart myCart);

	public List<MyCart> getMyCartProductByUserId(int userId);
	

}
