package com.verizon.CSP_B1api.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.verizon.CSP_B1api.model.OrderModel;
import com.verizon.CSP_B1api.repo.OrderRepo;

@Service
public class OrderService 
{
	private final  OrderRepo orderRepo;
	@Autowired
	public OrderService(OrderRepo orderRepo) 
	{
		this.orderRepo = orderRepo;
		
	}
	  
	public List<OrderModel> getAllOrderModel()
	{
		return orderRepo.findAll();
	}

	public OrderModel createordermodel(OrderModel OrderModel) {
		return orderRepo.save(OrderModel);
	}
	
}