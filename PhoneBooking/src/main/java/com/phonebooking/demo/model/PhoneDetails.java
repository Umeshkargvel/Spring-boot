package com.phonebooking.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class PhoneDetails {
	@Id
	private int modelid;
	private String brand;
	private String modelname;
	private int price;
	private String processer;
	private String ram;
	
	private String storage;
	private String colour;
	private String offer;
	PhoneDetails(){}
	public int getModelid() {
		return modelid;
	}
	public void setModelid(int modelid) {
		this.modelid = modelid;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getModelname() {
		return modelname;
	}
	public void setModelname(String modelname) {
		this.modelname = modelname;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getProcesser() {
		return processer;
	}
	public void setProcesser(String processer) {
		this.processer = processer;
	}
	public String getRam() {
		return ram;
	}
	public void setRam(String ram) {
		this.ram = ram;
	}
	public String getStorage() {
		return storage;
	}
	public void setStorage(String storage) {
		this.storage = storage;
	}
	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
	public String getOffer() {
		return offer;
	}
	public void setOffer(String offer) {
		this.offer = offer;
	}


}
