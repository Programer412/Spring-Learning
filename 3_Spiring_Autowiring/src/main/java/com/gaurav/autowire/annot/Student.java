package com.gaurav.autowire.annot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;


public class Student {

	@Autowired
	@Qualifier("add2")
	
	private Address address;
	
	

	public Student(Address address) {
		super();
		this.address = address;
		
		System.out.println("constructor injection");
	}

	public Address getAddress() {
		return address;
	}
	//@Autowired
	public void setAddress(Address address) {
		System.out.println("setter injection");
		this.address = address;
	}

	@Override
	public String toString() {
		return "Student [address=" + address + "]";
	}
	
	
}
