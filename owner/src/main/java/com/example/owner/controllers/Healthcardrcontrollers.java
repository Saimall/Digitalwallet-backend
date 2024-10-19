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

import com.example.owner.models.Foodcards;
import com.example.owner.models.HeatlthCard;
import com.example.owner.services.Healthservices;

@RestController
@RequestMapping("/healthcard")
public class Healthcardrcontrollers {
	
	
	@Autowired
	private Healthservices healthservices;
	
	
	@PostMapping("/add")
	public ResponseEntity<?>addhealthcard(@RequestBody HeatlthCard heatlthCard) {
		
		return new ResponseEntity<>(healthservices.addhealthcard(heatlthCard),HttpStatus.OK);
		
	}
	
	
	@GetMapping("/get/{id}")
	public List<HeatlthCard> gethealthcards(@PathVariable int id) {
		
		System.out.println("The family: "+id);
		
		return healthservices.gethealthcards(id);
		
	}
	
	@DeleteMapping("/delete/{number}")
	public void deletehealthcard(@PathVariable int number) {
		healthservices.deletehealthcard(number);
	}
	
	
	@PutMapping("/update/{number}")
	public HeatlthCard updatehealthcards(@PathVariable int number, @RequestBody HeatlthCard heatlthCard) {
		return healthservices.updatehealthcard(number,heatlthCard);
	}
	
	
	
	
	
	
	

}
