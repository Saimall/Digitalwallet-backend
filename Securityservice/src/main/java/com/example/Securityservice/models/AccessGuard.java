package com.example.Securityservice.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class AccessGuard {
	
	@Id
	private int id;
	private String username;
	private String password;
	private String familyid;
	
	public String getFamilyid() {
		return familyid;
	}



	public void setFamilyid(String familyid) {
		this.familyid = familyid;
	}



	@Override
	public String toString() {
		return "AccessGuard [id=" + id + ", username=" + username + ", password=" + password + ", familyid=" + familyid
				+ "]";
	}
	
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
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
	

}
