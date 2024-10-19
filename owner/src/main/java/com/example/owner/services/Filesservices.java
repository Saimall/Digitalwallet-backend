package com.example.owner.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.example.owner.models.Files;
import com.example.owner.repository.Filesrepository;

@Service
public class Filesservices {
	
	
	@Autowired
	private Filesrepository filesrepository;

	public Files addfile(Files files) {
		
		return  filesrepository.save(files);
		
	}

	public List<Files> getfiles(int id) {
		
		
		return filesrepository.findByFamilyid(id);
	}

	public void deletefile(int number) {
		
		Files file = filesrepository.findByNumber(number);
		
		filesrepository.delete(file);
		
	}

	public Files updatefile(int number, Files file) {
		
		Files newfile = filesrepository.findByNumber(number);
		
	newfile.setDescription(file.getDescription());
		
		newfile.setEntityname(file.getEntityname());
		
		newfile.setName(file.getName());
		
		newfile.setNumber(file.getNumber());
		
		newfile.setFamilyid(file.getFamilyid());
		
	return	filesrepository.save(newfile);
		
		
		
	}
	
	
	
}
