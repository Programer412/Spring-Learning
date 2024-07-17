package com.gaurav.javaconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		
		
		//ApplicationContext context=new ClassPathXmlApplicationContext("com/gaurav/javaconfig/config.xml");
		
		ApplicationContext context=new AnnotationConfigApplicationContext(config.class);
  //Emp e=context.getBean("getEmp",Emp.class);
  
  Emp e=context.getBean("emps",Emp.class);
		System.out.println(e);
	}

}
