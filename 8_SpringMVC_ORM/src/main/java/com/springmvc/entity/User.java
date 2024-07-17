package com.springmvc.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Transient;

@Entity
@javax.persistence.Table(name="user_dtls")
public class User {
	@Id
	@GeneratedValue (strategy=GenerationType.AUTO)

	
private  int id;
 
private String fullname;

private String password;

private String email;

@Transient
private String check;

private String image;


public String getImage() {
	return image;
}

public void setImage(String image) {
	this.image = image;
}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getCheck() {
	return check;
}

public void setCheck(String check) {
	this.check = check;
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
	return "User [id=" + id + ", fullname=" + fullname + ", password=" + password + ", email=" + email + ", check="
			+ check + ", image=" + image + "]";
}





}
