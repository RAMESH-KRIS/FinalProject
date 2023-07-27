package org.verizon.CSP_B1Api.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Catalogmodel {
@Id
	
	private int plan_id;
   private String plan;
	private int price;
	private String duration;
	
	
	
	public Catalogmodel() {
		super();
	}
	public String getPlan() {
		return plan;
	}
	public void setPlan(String plan) {
		this.plan = plan;
	}
	public int getPlan_id() {
		return plan_id;
	}
	public void setPlan_id(int plan_id) {
		this.plan_id = plan_id;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getDuration() {
		return duration;
	}
	public void setDuration(String duration) {
		this.duration = duration;
	}
	
}
