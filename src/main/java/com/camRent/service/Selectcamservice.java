package com.camRent.service;

import com.camRent.ResponseCam.ResponseCam;
import com.camRent.model.SelectCammodel;

public interface Selectcamservice {

	ResponseCam saveSelectCammodel(SelectCammodel selectCamModel);

	 ResponseCam getAllModels();

	 ResponseCam getCamId(Integer camId);

	//void getByCamId(Integer camId);
	}


