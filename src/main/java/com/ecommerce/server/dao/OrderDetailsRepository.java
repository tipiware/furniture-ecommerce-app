package com.ecommerce.server.dao;

import com.ecommerce.server.entity.OrderDetails;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderDetailsRepository extends JpaRepository<OrderDetails, Integer> {
	public List<OrderDetails> getOrderDataByuserId(int userId);

	public OrderDetails getOrderDataByOrderId(int orderId);
}
