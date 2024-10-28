package com.example.owner.models;

import jakarta.persistence.Entity;

import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Layout {
	
	private int familyid;
	
	@Id
	private int number;
	
	private String entityname;
	
	public Layout(int number2, String entityName2,int familyid) {
		this.number=number2;
		this.entityname = entityName2;
		this.familyid=familyid;
		
	}
	
	public Layout() {
		
		
		
	}

	public int getFamilyid() {
		return familyid;
	}


	public void setFamilyid(int familyid) {
		this.familyid = familyid;
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
