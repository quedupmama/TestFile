package com.test.file;

public class Delivery {
private	String address; 
private	String phoneNumber;
	public Delivery (String address, String phoneNumber) {
		this.address = address;
		this.phoneNumber = phoneNumber;
			
	}
public String getAddress() {
	return this.address; 
}
public void setAddress(String address ) {
	this.address = address;
}
}

