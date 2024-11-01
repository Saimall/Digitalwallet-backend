package com.example.owner.controllers;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.example.owner.models.Files;

import com.example.owner.services.Filesservices;


@RestController
@RequestMapping("/files")
public class Filescontrollers {
	
	
			@Autowired
			private Filesservices filesservices;
			
			@PostMapping("/add")
			public ResponseEntity<?>addfiles(@ModelAttribute Files files, @RequestPart("pdfFile") MultipartFile pdfFile) throws IOException {
				
				
				return new ResponseEntity<>(filesservices.addfile(files,pdfFile),HttpStatus.OK);
				
			}
			
			
			@GetMapping("/get/{familyid}")
			public List<Files> getfiles(@PathVariable int familyid) {
				
				System.out.println("The family: "+familyid);
				
				return filesservices.getfiles(familyid);
				
			}
			
			@DeleteMapping("/delete/{number}")
			public void deletefiles(@PathVariable int number) {
				filesservices.deletefile(number);
			}
			
			
			@PutMapping("/update/{number}")
			public Files updatefiles(@PathVariable int number, @ModelAttribute Files file, @RequestPart("pdfFile") MultipartFile pdFile) throws IOException {
				return filesservices.updatefile(number,file,pdFile);
			}
			
			
			@GetMapping("/getbynumber/{number}")
			public Files getfilebynumber(@PathVariable int number) {
				
				System.out.println("The family: "+number);
				
				return filesservices.getfilebynumber(number);
				
			}
			
			
		
}
