package com.example.owner.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.owner.models.Atmcards;
import com.example.owner.services.Ownerservice;

@RestController
@RequestMapping("/owner")
public class Ownercontrollers {
	
	@Autowired
	Ownerservice ownerservice;
	
	
	@GetMapping("/home")
	public String Home() {
		return "Hello welcome to Wallet";
	}
	
	
}
