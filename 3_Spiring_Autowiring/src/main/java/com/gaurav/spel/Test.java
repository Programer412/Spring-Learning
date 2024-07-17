package com.gaurav.spel;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.expression.spel.standard.SpelCompiler;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("com/gaurav/spel/config.xml");
		
		Student st = context.getBean("student",Student.class);
         
		//System.out.println(st.num1);
		
		System.out.println(st.result);
		
		
		SpelExpressionParser parser=new SpelExpressionParser();
		org.springframework.expression.Expression ex=parser.parseExpression("'hello world'");
		
		System.out.println(ex.getValue());
	} 
	
}
