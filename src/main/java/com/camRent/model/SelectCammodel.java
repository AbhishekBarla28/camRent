package com.camRent.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="SelectCammodel")
public class SelectCammodel {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer camId;
	private String camModel;
	private Integer camPrice;
	public Integer getCamId() {
		return camId;
	}
	public void setCamId(Integer camId) {
		this.camId = camId;
	}
	public String getCamModel() {
		return camModel;
	}
	public void setCamModel(String camModel) {
		this.camModel = camModel;
	}
	public Integer getCamPrice() {
		return camPrice;
	}
	public void setCamPrice(Integer camPrice) {
		this.camPrice = camPrice;
	}

}
