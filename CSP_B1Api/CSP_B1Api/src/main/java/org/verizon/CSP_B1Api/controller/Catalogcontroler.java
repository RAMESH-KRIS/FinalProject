package org.verizon.CSP_B1Api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.verizon.CSP_B1Api.model.Catalogmodel;
import org.verizon.CSP_B1Api.service.Catalogservice;

@RestController
@RequestMapping("/api/catalogmodel")
public class Catalogcontroler {
	private Catalogservice catalogservice;
	@Autowired
	public Catalogcontroler(Catalogservice catalogservice)
	{
		this.catalogservice=catalogservice;
	}
	@RequestMapping("/allcat")
	public List<Catalogmodel>getAllCatalogmodel()
	{
		return catalogservice.getAllCatalogmodel();
	}
	@PostMapping("/inserts")
	public Catalogmodel createcatalogmodel(@RequestBody Catalogmodel catmod)
	{
		return catalogservice.createcatalogmodel(catmod); 
	}
}