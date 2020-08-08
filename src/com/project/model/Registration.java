package com.project.model;

import java.sql.Date;

public class Registration {
private int id;
private String username;
private String password;
private String fname;
private String mname;
private String lname;
private String gender;
private String Email;
private String phone;
private Date dob;
private String college;
private String address;
private String confirmpassword;
private String oldpassword;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}

public String getOldpassword() {
	return oldpassword;
}
public void setOldpassword(String oldpassword) {
	this.oldpassword = oldpassword;
}
public String getConfirmpassword() {
	return confirmpassword;
}
public void setConfirmpassword(String confirmpassword) {
	this.confirmpassword = confirmpassword;
}
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public String getFname() {
	return fname;
}
public void setFname(String fname) {
	this.fname = fname;
}
public String getMname() {
	return mname;
}
public void setMname(String mname) {
	this.mname = mname;
}
public String getLname() {
	return lname;
}
public void setLname(String lname) {
	this.lname = lname;
}
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}
public String getEmail() {
	return Email;
}
public void setEmail(String email) {
	Email = email;
}
public String getPhone() {
	return phone;
}
public void setPhone(String phone) {
	this.phone = phone;
}
public Date getDob() {
	return dob;
}
public void setDob(Date dob) {
	this.dob = dob;
}
public String getCollege() {
	return college;
}
public void setCollege(String collage) {
	this.college = collage;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}

}
