package com.verizon.CSP_B1api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.verizon.CSP_B1api.model.CustomerModel;
import com.verizon.CSP_B1api.repo.CustomerRepo;

@Service
public class CustomerService {

	private final CustomerRepo customerrepo;

	@Autowired
	public CustomerService(CustomerRepo customerrepo) {
		this.customerrepo = customerrepo;

	}

	public List<CustomerModel> getAllCustomerModel() {
		return customerrepo.findAll();
	}

	public CustomerModel createcustomermodel(CustomerModel customermod) {
		return customerrepo.save(customermod);
	}
	public CustomerModel updateCustomerModel(Integer Cust_id, CustomerModel cust)
	{
		CustomerModel existingCustomerModel= customerrepo.findById(Cust_id).orElse(null);
		if(existingCustomerModel !=null)
		{
			existingCustomerModel.setCust_name(cust.getCust_name());
			existingCustomerModel.setCust_id(cust.getCust_id());
			return customerrepo.save(existingCustomerModel);
		}
		return null;
}


}