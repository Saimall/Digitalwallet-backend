package com.example.owner.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.example.owner.models.HeatlthCard;
import com.example.owner.repository.HelathcardsRepository;

@Service
public class Healthservices {
	
	@Autowired
	private HelathcardsRepository helathcardsRepository;

	public HeatlthCard addhealthcard(HeatlthCard heatlthCard) {
		return helathcardsRepository.save(heatlthCard);
	}

	public List<HeatlthCard> gethealthcards(int id) {
		return helathcardsRepository.findByFamilyid(id);
	}

	public void deletehealthcard(int number) {
		
	HeatlthCard heatlthCard = 	helathcardsRepository.findByNumber(number);
	
    helathcardsRepository.delete(heatlthCard);
		
	}

	public HeatlthCard updatehealthcard(int number, HeatlthCard heatlthCard) {
		
		HeatlthCard heatlthCard2 = helathcardsRepository.findByNumber(number);
		
		heatlthCard2.setEntityname(heatlthCard.getEntityname());
		heatlthCard2.setExpireDate(heatlthCard.getExpireDate());
		
		heatlthCard2.setIssueDate(heatlthCard.getIssueDate());
		
		heatlthCard2.setNumber(heatlthCard.getNumber());
		heatlthCard2.setPolicynumber(heatlthCard.getPolicynumber());
		heatlthCard2.setFamilyid(heatlthCard.getFamilyid());
		

		
		return helathcardsRepository.save(heatlthCard2);
	}

	

}
