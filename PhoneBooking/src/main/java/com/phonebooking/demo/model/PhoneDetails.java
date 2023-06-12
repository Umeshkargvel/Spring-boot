 package com.phonebooking.demo.model;

//import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
//import jakarta.persistence.JoinColumn;
//import jakarta.persistence.OneToOne;

@Entity
public class PhoneDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int modelid;
	private String brand;
	private String modelname;
	private int price;
	private String processer;
	private String ram;
	
	private String storage;
	private String colour;
	private String offer;
	
//	@OneToOne(cascade=CascadeType.ALL)
//	@JoinColumn(name="features")
//	private Special fid;
	
//	public Special getFid() {
//		return fid;
//	}
//	public void setFid(Special fid) {
//		this.fid = fid;
//	}
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
