package com.verizon.CSP_B1api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.verizon.CSP_B1api.model.OrderModel;
import com.verizon.CSP_B1api.service.OrderService;

@RestController
@RequestMapping("/api/ordermodel")
public class OrderController 
{
		
		private OrderService orderservice;
	 
		@Autowired
		public OrderController(OrderService orderservice) 
		{
			
			this.orderservice = orderservice;
		}
		  @RequestMapping("/allorder") 
		  public List<OrderModel> getAllOrderModel() 
		  {
		  return orderservice.getAllOrderModel();
		  
		  }
		  
		  @PostMapping("/insert") public OrderModel creatordermodel(@RequestBody
		  OrderModel ordermod) { return orderservice.createordermodel(ordermod); }
		 	
	}
