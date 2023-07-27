package org.verizon.CSP_B1Api.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.verizon.CSP_B1Api.model.Catalogmodel;

@Repository
public interface Catalogrepo extends JpaRepository<Catalogmodel,Integer>
{
	}
