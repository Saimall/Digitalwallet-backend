package com.example.owner.models;



import java.sql.Date;

import jakarta.persistence.Entity;

@Entity
public class Ottdetails extends Layout {
	
	
	public Ottdetails() {
		
	}
	
	private String username;
	private String password;
	private Date expiryDate;
	
	
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


	public Date getExpiryDate() {
		return expiryDate;
	}


	public void setExpiryDate(Date expiryDate) {
		this.expiryDate = expiryDate;
	}


	
	

	public Ottdetails(int userid, int number2, String entityName2, String username, String password, Date expiryDate) {
		super(number2, entityName2,userid);
		
		this.username=username;
		this.password=password;
		this.expiryDate=expiryDate;
		
	}
	
	
	@Override
	public String toString() {
		return "Ottdetails [username=" + username + ", password=" + password + ", expiryDate=" + expiryDate + "]";
	}

}
