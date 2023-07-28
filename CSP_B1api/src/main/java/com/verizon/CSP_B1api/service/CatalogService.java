package com.verizon.CSP_B1api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.verizon.CSP_B1api.model.CatalogModel;
import com.verizon.CSP_B1api.repo.CatalogRepo;

@Service
public class CatalogService {

	private final CatalogRepo catalogrepo;

	@Autowired
	public CatalogService(CatalogRepo catalogrepo) {
		this.catalogrepo = catalogrepo;

	}

	public List<CatalogModel> getAllCatalogModel() {
		return catalogrepo.findAll();
	}

	public CatalogModel createcatalogmodel(CatalogModel catmod) {
		return catalogrepo.save(catmod);
	}
	public CatalogModel updateCatalogModel(Integer plan_id, CatalogModel cata)

	{
		CatalogModel existingCatalogModel= catalogrepo.findById(plan_id).orElse(null);
		if(existingCatalogModel !=null)
		{
			existingCatalogModel.setPlan(cata.getPlan());
			existingCatalogModel.setDuration(cata.getDuration());
			existingCatalogModel.setPrice(cata.getPrice());
			return catalogrepo.save(existingCatalogModel);
		}
		   return null;
	}
	public void deleteCatalogModel(Integer plan_id) {
		catalogrepo.deleteById(plan_id);
	}
}


