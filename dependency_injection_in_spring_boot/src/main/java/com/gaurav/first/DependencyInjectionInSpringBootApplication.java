package com.gaurav.first;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DependencyInjectionInSpringBootApplication {

	public static void main(String[] args) {
		ApplicationContext context=SpringApplication.run(DependencyInjectionInSpringBootApplication.class, args);//so here run gives us the object og application context
	
		gaurav obj=context.getBean(gaurav.class);//getbean method belongs to interface application context
		obj.code();
	}

}
