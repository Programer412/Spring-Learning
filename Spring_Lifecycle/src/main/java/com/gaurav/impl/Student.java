package com.gaurav.impl;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Student implements InitializingBean,DisposableBean{
	
	private int id;
	private String name;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}
	
	
	@Override
	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("distroy Object");
		
	}
	
	@Override
	public void afterPropertiesSet() throws Exception {
System.out.println("Initilization object");
		
	}


}
