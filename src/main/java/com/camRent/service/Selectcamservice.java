package com.camRent.service;

import com.camRent.model.SelectCammodel;

import ResponseCam.ResponseCam;

public interface Selectcamservice {

	ResponseCam saveSelectCammodel(SelectCammodel selectCamModel);

	 ResponseCam getAllModels();

	 ResponseCam getByCamId(Integer camId);

	//void getByCamId(Integer camId);
	}


