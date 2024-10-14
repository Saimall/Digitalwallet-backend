package com.example.owner.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.owner.models.Atmcards;
import com.example.owner.repository.Ownerrepository;

@Service
public class Ownerservice {
	
	
	@Autowired
	private Ownerrepository ownerrepository;

	public Atmcards addatmcard(Atmcards atmcards) {
		return ownerrepository.save(atmcards);
	}

}
