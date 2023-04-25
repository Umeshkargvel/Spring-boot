package com.phonebooking.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class PhoneDetails {
	@Id
	private int ModelId;
	public int getModelId() {
		return ModelId;
	}
	public void setModelId(int modelId) {
		ModelId = modelId;
	}
	public String getBrand() {
		return Brand;
	}
	public void setBrand(String brand) {
		Brand = brand;
	}
	public String getModelName() {
		return ModelName;
	}
	public void setModelName(String modelName) {
		ModelName = modelName;
	}
	public String getProcesser() {
		return Processer;
	}
	public void setProcesser(String processer) {
		Processer = processer;
	}
	public String getRam() {
		return Ram;
	}
	public void setRam(String ram) {
		Ram = ram;
	}
	public int getPrice() {
		return Price;
	}
	public void setPrice(int price) {
		Price = price;
	}
	private String Brand;
	private String ModelName;
	private String Processer;
	private String Ram;
	private int Price;

}
