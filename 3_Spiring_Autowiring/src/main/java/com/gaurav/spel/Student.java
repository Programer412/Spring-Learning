package com.gaurav.spel;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component
public class Student {
    
	@Value("#{2+3}")
	public int num;
	
	@Value("#{5-3}")
	public int sub;
	
	@Value("#{2+3}")
	public int mul;
	
	@Value("#{15/3}")
	public int div;
	
	@Value("#{1==1}")
	public boolean equalvalid;
	
	@Value("#{1==1 && 2==2}")
	public boolean checkstatus;

	@Value("#{2>3 ? 'yes' : 'No'}")
	public String terinaryCheck;
	
	@Value("#{T(java.lang.Math).sqrt(144)}")
	
public int num1;
	
	public static String call()
	{
		return "method call";
	}
	@Value("#{T(com.gaurav.spel.Student).call()}")
	public String result;
	
	@Override
	public String toString() {
		return "Student [num=" + num + ", sub=" + sub + ", mul=" + mul + ", div=" + div + ", equalvalid=" + equalvalid
				+ "]";
	}
	
	
	
	
}
