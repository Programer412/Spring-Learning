package com.springmvc.entity;

public class User {
private  int id;
 
private String fullname;

private String password;

private String email;

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getFullname() {
	return fullname;
}

public void setFullname(String fullname) {
	this.fullname = fullname;
}

public String getPassword() {
	return password;
}

public void setPassword(String password) {
	this.password = password;
}

public String getemail() {
	return email;
}

public void setemail(String email) {
	this.email = email;
}

@Override
public String toString() {
	return "User [id=" + id + ", fullname=" + fullname + ", password=" + password + ", email=" + email + "]";
}



}
