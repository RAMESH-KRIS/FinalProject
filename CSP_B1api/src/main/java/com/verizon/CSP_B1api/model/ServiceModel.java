package com.verizon.CSP_B1api.model;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class ServiceModel 
{
	@Id
	private int service_id;
	@ManyToOne
	@JoinColumn(name="order_id")
	private ServiceModel servicemodel;
	private String Provision;
	private String Test_qos;
	private String Activity;
	public ServiceModel() {
			// TODO Auto-generated constructor stub
	}
	public int getService_id() {
		return service_id;
	}
	public void setService_id(int service_id) {
		this.service_id = service_id;
	}
	public ServiceModel getServicemodel() {
		return servicemodel;
	}
	public void setServicemodel(ServiceModel servicemodel) {
		this.servicemodel = servicemodel;
	}
	public String getProvision() {
		return Provision;
	}
	public void setProvision(String provision) {
		Provision = provision;
	}
	public String getTest_qos() {
		return Test_qos;
	}
	public void setTest_qos(String test_qos) {
		Test_qos = test_qos;
	}
	public String getActivity() {
		return Activity;
	}
	public void setActivity(String activity) {
		Activity = activity;
	}
	

	
}

