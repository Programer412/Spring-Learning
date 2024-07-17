package com.gaurav.javaconfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


public class Emp {
	
	//@Autowired
	private Address address;
	
	
	
	

	public Emp(Address address) {
		super();
		this.address = address;
	}

	public Address getAddresss() {
		return address;
	}

	public void setAddresss(Address addresss) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Emp [address=" + address + "]";
	}
	
	

}
