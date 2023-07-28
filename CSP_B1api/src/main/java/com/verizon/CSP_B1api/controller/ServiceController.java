package com.verizon.CSP_B1api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.verizon.CSP_B1api.model.ServiceModel;
import com.verizon.CSP_B1api.service.ServiceService;

@RestController
@RequestMapping("/api/service")
public class ServiceController 
{
	private ServiceService serviceservice;

	@Autowired
	public ServiceController(ServiceService serviceservice) {
		this.serviceservice = serviceservice;
	}

	@RequestMapping("/allservice")
	public List<ServiceModel> getAllServiceModel() {
		return serviceservice.getAllServiceModel();

	}

	@PostMapping("/insert")
	public ServiceModel createservicemodel(@RequestBody ServiceModel servmod) {
		return serviceservice.createservicemodel(servmod);
	}
}
