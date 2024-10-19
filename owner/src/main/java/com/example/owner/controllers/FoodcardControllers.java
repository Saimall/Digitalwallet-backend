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
import com.example.owner.services.Foodcardservice;



@RestController
@RequestMapping("/foodcard")
public class FoodcardControllers {
		
		@Autowired
		private Foodcardservice foodcardservice;
		
		@PostMapping("/add")
		public ResponseEntity<?>addfoodcard(@RequestBody Foodcards foodcards) {
			
			return new ResponseEntity<>(foodcardservice.addfoodcard(foodcards),HttpStatus.OK);
			
		}
		
		
		@GetMapping("/get/{id}")
		public List<Foodcards> getfoodcard(@PathVariable int id) {
			
			System.out.println("The family: "+id);
			
			return foodcardservice.getfoodcards(id);
			
		}
		
		@DeleteMapping("/delete/{number}")
		public void deletefoodcard(@PathVariable int number) {
			foodcardservice.deletecard(number);
		}
		
		
		@PutMapping("/update/{number}")
		public Foodcards updatefoodcards(@PathVariable int number, @RequestBody Foodcards foodcards) {
			return foodcardservice.updatecard(number,foodcards);
		}
		
		
		
		



	
	
}
