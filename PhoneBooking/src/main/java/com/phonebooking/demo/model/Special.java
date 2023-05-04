package com.phonebooking.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Special {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	
	private int id;
	private String waranty;
	private String rating;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getWaranty() {
		return waranty;
	}
	public void setWaranty(String waranty) {
		this.waranty = waranty;
	}
	public String getRating() {
		return rating;
	}
	public void setRating(String rating) {
		this.rating = rating;
	}
	
}
