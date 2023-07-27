package org.verizon.CSP_B1Api.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Ordermodel {
@Id
    private int plan_id;
    public int order_id() {
	return plan_id;
}
public void setPlan_id(int plan_id) {
	this.plan_id = plan_id;
}
public int getOrder_id() {
	return order_id;
}
public void setOrder_id(int order_id) {
	this.order_id = order_id;
}
	private int order_id;
}
