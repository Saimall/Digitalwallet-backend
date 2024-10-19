package com.example.FiegnClient.DTOS;

import java.sql.Date;

public class Rtopojo extends Layoutpojo {
	
public Rtopojo() {
		
	}

	private Date issueDate;
	private Date expireDate;
	private String username; 
	

	public Rtopojo(int userid, int number2, String entityName2, Date expireDate, Date issueDate, String username) {
		super(number2, entityName2,userid);
		this.expireDate=expireDate;
		this.issueDate=issueDate;
		this.username=username;
		
	}


}
