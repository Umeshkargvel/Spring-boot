package com.phonebooking.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Signup {
	@Id
	@GeneratedValue
	private int id;
	private String username;
	private long mobileno;
	private String emailid;
	private String password;
	private String address;
	private int pincode;
	
	@Override
	public String toString() {
		return "signup [id=" + id + ", username=" + username + ", mobileno=" + mobileno + ", emailid=" + emailid
				+ ", password=" + password + ", address=" + address + ", pincode=" + pincode + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	
	
	public long getMobileno() {
		return mobileno;
	}
	public void setMobileno(long mobileno) {
		this.mobileno = mobileno;
	}
	public String getEmailid() {
		return emailid;
	}
	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Signup(int id, String username,long mobileno, String emailid, String password, String address, int pincode) {
		super();
		this.id = id;
		this.username = username;
		this.mobileno=mobileno;
		this.emailid = emailid;
		this.password = password;
		this.address = address;
		this.pincode = pincode;
	}
	public Signup() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
