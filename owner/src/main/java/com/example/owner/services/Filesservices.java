package com.example.owner.services;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cloudinary.Cloudinary;
import com.example.owner.models.Files;
import com.example.owner.repository.Filesrepository;
import org.springframework.web.multipart.MultipartFile;

@Service
public class Filesservices {
	
	
	@Autowired
	private Filesrepository filesrepository;
	
	
	@Autowired
    private Cloudinary cloudinary;
	

	public Files addfile(Files files, MultipartFile pdFile) throws IOException {
		Map<String, Object> uploadResult = cloudinary.uploader().upload(pdFile.getBytes(), Map.of());
		
		files.setImageData((String) uploadResult.get("secure_url"));
	    files.setCloudinaryPublicId((String) uploadResult.get("public_id")); 
	    files.setImageType(pdFile.getContentType());
	
		
		return  filesrepository.save(files);
		
	}

	public List<Files> getfiles(int id) {
		
		
		return filesrepository.findByFamilyid(id);
	}

	public void deletefile(int number) {
		
		Files file = filesrepository.findByNumber(number);
		
		filesrepository.delete(file);
		
	}

	@Transactional
	public Files updatefile(int number, Files file, MultipartFile pdFile) throws IOException {
		
		Files newfile = filesrepository.findByNumber(number);
		
	newfile.setDescription(file.getDescription());
		
		newfile.setEntityname(file.getEntityname());
		
		newfile.setName(file.getName());
		
		newfile.setNumber(file.getNumber());
		
		newfile.setFamilyid(file.getFamilyid());
		
		 if (pdFile != null && !pdFile.isEmpty()) {
		        Map<String, Object> uploadResult = cloudinary.uploader().upload(pdFile.getBytes(), Map.of());
		        newfile.setImageData((String) uploadResult.get("secure_url")); 
		        newfile.setCloudinaryPublicId((String) uploadResult.get("public_id")); 
		        newfile.setImageType(pdFile.getContentType()); 
		    }
		
	return	filesrepository.save(newfile);
		
		
		
	}
	
	
	
}
