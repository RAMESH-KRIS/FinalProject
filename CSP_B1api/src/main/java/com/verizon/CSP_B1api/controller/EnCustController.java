package com.verizon.CSP_B1api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.verizon.CSP_B1api.model.CustomerModel;
import com.verizon.CSP_B1api.model.EnCustModel;
import com.verizon.CSP_B1api.service.EnCustService;

@RestController
@RequestMapping("/api/encustmodel")
public class EnCustController

{
	private EnCustService encustservice;

	@Autowired
	public EnCustController(EnCustService encustservice) {
		this.encustservice = encustservice;
	}

	@RequestMapping("/allcust")
	public List<EnCustModel> getAllEnCustModel() {
		return encustservice.getAllEnCustModel();

	}

	@PostMapping("/insert")
	public EnCustModel createencustmodel(@RequestBody EnCustModel encustmod) {
		return encustservice.createencustmodel(encustmod);
	}
	@PostMapping("/{plan_id}")
	public EnCustModel updateencustmodel(@RequestBody Integer Cust_id,EnCustModel cust)
	{
		return encustservice.updateEnCustModel(Cust_id,cust);
	}
	
}
