package com.camRent.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.camRent.model.SelectCammodel;
import com.camRent.service.Selectcamservice;

import ResponseCam.ResponseCam;

@RestController
@RequestMapping("/camera")
public class SelectCamcontroller {
	
	@Autowired
	Selectcamservice selectcamservice;
	
	
    @PostMapping("/save")
    public ResponseCam Savedetail(@RequestBody SelectCammodel selectCamModel) {
    	return selectcamservice.saveSelectCammodel(selectCamModel);
    }
    
    @GetMapping("/allModel")
    public ResponseCam getAllModels() {
    	return selectcamservice.getAllModels() ;
    }
    
    @GetMapping("get")
    public ResponseCam getByCamId(@RequestParam Integer camId ) {
    	return selectcamservice.getByCamId(camId);
    }


}
