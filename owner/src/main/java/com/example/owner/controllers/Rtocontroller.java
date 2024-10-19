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
import com.example.owner.models.Rto;
import com.example.owner.services.Healthservices;
import com.example.owner.services.Rtoservices;

@RestController
@RequestMapping("/rto")
public class Rtocontroller {
	
	@Autowired
	private Rtoservices rtoservices;
	
	@PostMapping("/add")
	public ResponseEntity<?>addrto(@RequestBody Rto rto) {
		
		return new ResponseEntity<>(rtoservices.addrtocard(rto),HttpStatus.OK);
		
	}
	
	
	@GetMapping("/get/{id}")
	public List<Rto> getrto(@PathVariable int id) {
		
		System.out.println("The familyid"+id);
		
		return rtoservices.getrtocards(id);
		
	}
	
	@DeleteMapping("/delete/{number}")
	public void deletertocard(@PathVariable int number) {
		rtoservices.deletecard(number);
	}
	
	
	@PutMapping("/update/{number}")
	public Rto updatertocards(@PathVariable int number, @RequestBody Rto rto) {
		return rtoservices.updatecard(number,rto);
	}
	
	

}
