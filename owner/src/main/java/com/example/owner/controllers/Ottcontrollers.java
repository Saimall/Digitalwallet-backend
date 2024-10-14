package com.example.owner.controllers;

import java.util.List;

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

import com.example.owner.models.Ottdetails;
import com.example.owner.services.OTTservices;

@RestController
@RequestMapping("/ott")
public class Ottcontrollers {
	
	
	@Autowired
	private OTTservices otTservices;
	
	@PostMapping("/add")
	public ResponseEntity<?>addottcard(@RequestBody Ottdetails ottdetails) {
		
		return new ResponseEntity<>(otTservices.addottdetails(ottdetails),HttpStatus.OK);
		
	}
	
	
	@GetMapping("/get/{id}")
	public List<Ottdetails> getottcards(@PathVariable int id) {
		
		System.out.println("The userid: "+id);
		
		return otTservices.getottdetails(id);
		
	}
	
	@DeleteMapping("/delete/{number}")
	public void deleteottcard(@PathVariable int number) {
		otTservices.deleteottdetails(number);
	}
	
	
	@PutMapping("/update/{number}")
	public Ottdetails updateOttdetails(@PathVariable int number, @RequestBody Ottdetails ottdetails) {
		return otTservices.updateottdetails(number,ottdetails);
	}
	
	
	
	
	

}
