package com.verizon.CSP_B1api.model;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
@Entity

public class OrderModel 
{

			@Id
			private int Plan_id;
			@ManyToOne
			@JoinColumn(name="order_id")
			private OrderModel ordermodel;
			private String Order_name;
		
			
			public OrderModel() {
				super();
			}
			public int getPlanid() {
				return Plan_id;
			}
			public void setPlanid(int Planid) {
				this.Plan_id = Planid;
			}
			public String getPlan() {
				return Order_name;
			}
			public void setPlan(String Order_name) {
				this.Order_name = Order_name;
			}
}
