package com.mvcdemo.model;

public class Student {
	private String Firstname;
	private String lastname;
	private String email;
	public String getFirstname() {
		return Firstname;
	}
	public void setFirstname(String firstname) {
		Firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Student(String firstname, String lastname, String email) {
		super();
		Firstname = firstname;
		this.lastname = lastname;
		this.email = email;
	}
	
	
	
}
