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
	

	public Rto(int userid, int number2, String entityName2, Date expireDate, Date issueDate, String username) {
		super(number2, entityName2,userid);
		this.expireDate=expireDate;
		this.issueDate=issueDate;
		this.username=username;
		
	}

}
