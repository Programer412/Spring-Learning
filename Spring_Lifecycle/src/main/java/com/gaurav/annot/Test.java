package com.gaurav.annot;


import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
public static void main(String[] args) {
AbstractApplicationContext context=	new ClassPathXmlApplicationContext("com/gaurav/annot/config.xml");

context.registerShutdownHook();  //this is for calling distroy method
Student st=context.getBean("st",Student.class);
	
System.out.println(st);
	
}
}