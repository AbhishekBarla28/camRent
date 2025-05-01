package com.camRent.dao;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.camRent.model.SelectCammodel;

public interface SelectCamdao extends JpaRepository<SelectCammodel, Integer>{

	List<SelectCammodel> findBycamId(Integer camId);
	//List<SelectCammodel> findAllBycamModel(String camModel);

}
