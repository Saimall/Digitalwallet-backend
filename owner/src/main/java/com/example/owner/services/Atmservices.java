package com.example.owner.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.owner.models.Atmcards;
import com.example.owner.repository.Atmrepository;

@Service
public class Atmservices {

	
	
	@Autowired
	private Atmrepository atmrepository;

	public Atmcards addatmcard(Atmcards atmcards) {
		return atmrepository.save(atmcards);
	}

	public List<Atmcards> getatmcards(int id) {
		return  atmrepository.findByFamilyid(id);
	}

	public void deletecard(int number) {
		Atmcards card  = atmrepository.findByNumber(number);
		
		atmrepository.delete(card);
	}

	public Atmcards updatecard(int number,Atmcards atmcards) {
		Atmcards cAtmcards = atmrepository.findByNumber(number);
		cAtmcards.setEntityname(atmcards.getEntityname());
		cAtmcards.setExpireDate(atmcards.getExpireDate());
	    cAtmcards.setIssueDate(atmcards.getIssueDate());
	    cAtmcards.setFamilyid(atmcards.getFamilyid());
	    cAtmcards.setUsername(atmcards.getUsername());
	    cAtmcards.setCvv(atmcards.getCvv());
	    
	    
	    
		return atmrepository.save(cAtmcards);
	}
	
	

	
	
	
}
