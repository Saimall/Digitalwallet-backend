package com.example.owner.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.owner.models.Ottdetails;
import com.example.owner.repository.Ottdetailsrepository;

@Service
public class OTTservices {
	
	@Autowired
	private Ottdetailsrepository ottdetailsrepository;

	public Object addottdetails(Ottdetails ottdetails) {
		return ottdetailsrepository.save(ottdetails);
	}

	public List<Ottdetails> getottdetails(int id) {
		return ottdetailsrepository.findByUserid(id);
	}

	public void deleteottdetails(int number) {
		Ottdetails ottdetails =  ottdetailsrepository.findByNumber(number);
		
		ottdetailsrepository.delete(ottdetails);
		
	}

	public Ottdetails updateottdetails(int number, Ottdetails ottdetails) {
		Ottdetails newottdetails =  ottdetailsrepository.findByNumber(number);
		
		newottdetails.setEntityname(ottdetails.getEntityname());
		
		newottdetails.setNumber(ottdetails.getNumber());
		
		newottdetails.setUserid(ottdetails.getUserid());
		
        newottdetails.setExpiryDate(ottdetails.getExpiryDate());
        newottdetails.setUsername(ottdetails.getUsername());
        
        newottdetails.setPassword(ottdetails.getPassword());
        
        return ottdetailsrepository.save(newottdetails);
        
	}
	
	

}
