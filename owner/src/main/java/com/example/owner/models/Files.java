package com.example.owner.models;

import jakarta.persistence.Entity;





@Entity
public class Files extends Layout {
	
	
	public Files() {
		
	}
	
	private String description;
	
	private String name;
	
	public Files(int userid, int number, String entityName, String description, String name) {
        super(number, entityName,userid);
        this.description = description;
        this.name = name;
    }
	
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	

}


