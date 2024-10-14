package com.example.owner.models;

import java.sql.Date;

import jakarta.persistence.Entity;


@Entity
public class Foodcards extends Layout {
	
	
	public Foodcards() {
		
	}
	
    private Date issueDate;
	private Date expireDate;
	private String username; 
	
	public Date getIssueDate() {
		return issueDate;
	}

	public void setIssueDate(Date issueDate) {
		this.issueDate = issueDate;
	}

	public Date getExpireDate() {
		return expireDate;
	}

	public void setExpireDate(Date expireDate) {
		this.expireDate = expireDate;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	

	public Foodcards(int userid, int number2, String entityName2, Date issueDate, Date expireDate, String username) {
		super(number2, entityName2, userid);
		this.issueDate = issueDate;
		this.expireDate =expireDate;
		this.username = username;
	}
	
	
	@Override
	public String toString() {
		return "Foodcards [issueDate=" + issueDate + ", expireDate=" + expireDate + ", username=" + username + "]";
	}
	
	
	
	
	

}
