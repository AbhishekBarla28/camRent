package com.camRent.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.camRent.dao.SelectCamdao;
import com.camRent.model.SelectCammodel;
import com.camRent.service.Selectcamservice;

import com.camRent.ResponseCam.ResponseCam;

@Service
public class SelectCamserviceimpl implements Selectcamservice {
    
	@Autowired
	SelectCamdao selectCamdao;
	
	@Override
	public ResponseCam saveSelectCammodel(SelectCammodel selectCamModel) {
		ResponseCam ResponseCam = new ResponseCam();
		SelectCammodel savedCamModel= selectCamdao.save(selectCamModel);
		ResponseCam.setData(savedCamModel);
		return ResponseCam;
	}

	@Override
	public ResponseCam getAllModels() {
		// TODO Auto-generated method stub
		ResponseCam ResponseCam=new ResponseCam();
		List<SelectCammodel> getAllMod = selectCamdao.findAll();
		ResponseCam.setData(getAllMod);
		//ResponseCam.setStatus(Status.OK);
		return ResponseCam;
	}

	@Override
	public ResponseCam getCamId(Integer camId) {
		// TODO Auto-generated method stub
		ResponseCam ResponseCam=new ResponseCam();
		List<SelectCammodel> getCam=selectCamdao.findBycamId(camId);
		ResponseCam.setData(getCam);
		return ResponseCam;
	}

}
