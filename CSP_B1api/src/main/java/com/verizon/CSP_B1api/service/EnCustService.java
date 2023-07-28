package com.verizon.CSP_B1api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.verizon.CSP_B1api.model.CatalogModel;
import com.verizon.CSP_B1api.model.EnCustModel;
import com.verizon.CSP_B1api.repo.EnCustRepo;

@Service
public class EnCustService {

	private final EnCustRepo EnCustrepo;

	@Autowired
	public EnCustService(EnCustRepo enCustrepo) {
		this.EnCustrepo = enCustrepo;
	}

	public List<EnCustModel> getAllEnCustModel() {
		return EnCustrepo.findAll();
	}

	public EnCustModel createencustmodel(EnCustModel encustmod) {
		return EnCustrepo.save(encustmod);
	}
	public EnCustModel updateEnCustModel(Integer plan_id, EnCustModel encust)
	{
		EnCustModel existingEnCustModel= EnCustrepo.findById(plan_id).orElse(null);
		if(existingEnCustModel !=null)
		{
			existingEnCustModel.setEc_id(encust.getEc_id());
			existingEnCustModel.setEc_name(encust.getEc_name());
			existingEnCustModel.setDuration(encust.getDuration());
			existingEnCustModel.setPrice(encust.getPrice());
			return EnCustrepo.save(existingEnCustModel);
		}
		return null;
	}
}
