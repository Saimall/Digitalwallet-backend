package com.example.owner.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.owner.models.Atmcards;
import com.example.owner.services.Atmservices;

@RestController
@RequestMapping("/atm")
public class Atmcardscontrollers {
	
	
	@Autowired
	private Atmservices atmservices;
	
	@PostMapping("/add")
	public ResponseEntity<?>addAtmcard(@RequestBody Atmcards atmcards) {
		
		return new ResponseEntity<>(atmservices.addatmcard(atmcards),HttpStatus.OK);
		
	}
	
	
	@GetMapping("/get/{familyid}")
	public List<Atmcards> getAtmcard(@PathVariable int familyid) {
		
		System.out.println("The family: "+familyid);
		
		return atmservices.getatmcards(familyid);
		
	}
	
	@DeleteMapping("/delete/{number}")
	public void deleteAtmcard(@PathVariable int number) {
		atmservices.deletecard(number);
	}
	
	
	@PutMapping("/update/{number}")
	public Atmcards updateAtmcards(@PathVariable int number, @RequestBody Atmcards atmcards) {
		return atmservices.updatecard(number,atmcards);
	}
	
	
	@GetMapping("/getbynumber/{number}")
	public Atmcards getAtmcardbynumber(@PathVariable int number) {
		return atmservices.getBynumber(number);
	}
	
	
	
	

}
