package com.gaurav.sterotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

public static void main(String[] args) {
	ApplicationContext context =new ClassPathXmlApplicationContext("com/gaurav/sterotype/config.xml");
	
	//Emp e=context.getBean("emp",Emp.class);
	Emp em=context.getBean("employee",Emp.class);
	Emp em2=context.getBean("employee",Emp.class);	
	System.out.println(em.hashCode());
	System.out.println(em2.hashCode()); 
	
	
}
}
