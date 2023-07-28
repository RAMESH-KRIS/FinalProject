package com.verizon.CSP_B1api.repo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.verizon.CSP_B1api.model.ServiceModel;


@Repository
public interface ServiceRepo extends JpaRepository<ServiceModel,Integer>{

}