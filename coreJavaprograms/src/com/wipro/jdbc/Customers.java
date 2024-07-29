package com.wipro.jdbc;

import java.util.List;

public class Customers {
	private Integer id;
	private String name;
	private String Email;
	private List<String> phonenumbers;
	
	
	public Customers(Integer id, String name, String email, List<String> phonenumbers) {
		super();
		this.id = id;
		this.name = name;
		Email = email;
		this.phonenumbers = phonenumbers;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public List<String> getPhonenumbers() {
		return phonenumbers;
	}
	public void setPhonenumbers(List<String> phonenumbers) {
		this.phonenumbers = phonenumbers;
	}
	
	

}
