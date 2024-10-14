package com.example.owner.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.owner.models.Foodcards;
import com.example.owner.repository.Foodcardsrepository;

@Service
public class Foodcardservice {
	
	@Autowired
	private Foodcardsrepository foodcardsrepository;

	public Foodcards addfoodcard(Foodcards foodcards) {
		
		return foodcardsrepository.save(foodcards);
	}

	public List<Foodcards> getfoodcards(int id) {
		return foodcardsrepository.findByUserid(id);
	}

	public void deletecard(int number) {
		Foodcards card = foodcardsrepository.findByNumber(number);
		
		foodcardsrepository.delete(card);
		
	}

	public Foodcards updatecard(int number, Foodcards foodcards) {
	Foodcards card	= foodcardsrepository.findByNumber(number);
	card.setEntityname(foodcards.getEntityname());
	card.setExpireDate(foodcards.getExpireDate());
	card.setIssueDate(foodcards.getIssueDate());
	card.setNumber(foodcards.getNumber());
	card.setUserid(foodcards.getUserid());
	card.setUsername(foodcards.getUsername());
	
	
	return foodcardsrepository.save(card);
	
	
	}
	
	
	

}
