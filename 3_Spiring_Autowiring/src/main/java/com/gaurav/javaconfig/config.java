package com.gaurav.javaconfig;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Primary;

//@Configuration
//@ComponentScan(basePackages="com.gaurav.javaconfig")
public class config {
	@Bean
	@Primary
	public Address add() {
		return new Address("first bean");
	}
	
//	@Bean
//	public Address getaddress() {
//		return new Address("second bean");
//	}
	
	@Bean(name= {"emps"})
	public Emp getEmp()
	{
		return new Emp(add());
	}

}
