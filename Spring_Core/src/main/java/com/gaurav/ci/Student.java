package com.gaurav.ci;

import java.util.List;

public class Student {
private int id;

private String name;

private String address;

private List<String> course;

private Certificate certificate;



public Student(int id, String name, String address, List<String> course, Certificate certificate) {
	super();
	this.id = id;
	this.name = name;
	this.address = address;
	this.course = course;
	this.certificate = certificate;
}
public Student(String name,int id)
{System.out.println("2 const");
	this.id=id;
this.name=name;
	
}
public Student(int id,String name)
{System.out.println("1 const");
	this.id=id;
this.name=name;
	
}

public Student(String address,String name)
{System.out.println("3 const");
	
	this.address=address;
this.name=name;
	
}
//@Override
//public String toString() {
//	return "Student [id=" + id + ", name=" + name + ", address=" + address + "]";
//}
@Override
public String toString() {
	return "Student [id=" + id + ", name=" + name + ", address=" + address + ", course=" + course + ", certificate="
			+ certificate + "]";
}


}
