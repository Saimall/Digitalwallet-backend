package com.example.owner.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.owner.models.Rto;
import com.example.owner.repository.Rtorepository;

@Service
public class Rtoservices {
	
	
	@Autowired
	private Rtorepository rtorepository;

	public Rto addrtocard(Rto rto) {
		
		return rtorepository.save(rto);
	}

	public List<Rto> getrtocards(int id) {
		return rtorepository.findByFamilyid(id);
	}

	public void deletecard(int number) {
		Rto rto = rtorepository.findByNumber(number);
		
		rtorepository.delete(rto);
		
	}

	public Rto updatecard(int number, Rto rto) {
		Rto rto2 = rtorepository.findByNumber(number);
		
		rto2.setEntityname(rto.getEntityname());
		rto2.setNumber(rto.getNumber());
		
		rto2.setFamilyid(rto.getFamilyid());
		
		return rtorepository.save(rto2);
	}

	public Rto getrtocardbynumber(int number) {
		return rtorepository.findByNumber(number);
	}

}
