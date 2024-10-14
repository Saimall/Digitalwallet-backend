package com.example.owner.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Layout {
	
	private int userid;
	
	@Id
	private int number;
	
	private String entityname;
	
	public Layout(int number2, String entityName2,int userid) {
		this.number=number2;
		this.entityname = entityName2;
		this.userid=userid;
		// TODO Auto-generated constructor stub
	}
	
	public Layout() {
		// TODO Auto-generated constructor stub
	}

	public int getUserid() {
		return userid;
	}


	public void setUserid(int userid) {
		this.userid = userid;
	}

	
	
	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getEntityname() {
		return entityname;
	}

	public void setEntityname(String entityname) {
		this.entityname = entityname;
	}
	
	@Override
	public String toString() {
		return "Layout [number=" + number + ", entityname=" + entityname + "]";
	}

	

	

}
