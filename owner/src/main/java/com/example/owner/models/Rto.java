package com.example.owner.models;

import java.sql.Date;

import jakarta.persistence.Entity;

@Entity
public class Rto extends Layout {
	
	public Rto() {
		
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

	
	

	public Rto(int userid, int number2, String entityName2, Date expireDate, Date issueDate, String username) {
		super(number2, entityName2,userid);
		this.expireDate=expireDate;
		this.issueDate=issueDate;
		this.username=username;
		
	}
	
	
	@Override
	public String toString() {
		return "Rto [issueDate=" + issueDate + ", expireDate=" + expireDate + ", username=" + username + "]";
	}

}
