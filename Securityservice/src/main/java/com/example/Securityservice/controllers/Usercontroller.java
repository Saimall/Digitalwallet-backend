package com.example.Securityservice.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.Securityservice.models.AccessGuard;
import com.example.Securityservice.services.Userdetailsservice;
import com.example.Securityservice.services.Userservice;

@RestController
@RequestMapping("/user")
public class Usercontroller {
	
	
	@Autowired
	private Userservice userservice;
	
	
	@Autowired
	private AuthenticationManager authenticationManager;
	
	

	
	
	
	
	@PostMapping("/add")
	public AccessGuard adduser(@RequestBody AccessGuard accessGuard){
		return userservice.adduser(accessGuard);
		
	}
	
	

   @GetMapping("/get")
   public List<AccessGuard> getusers(){
	   return userservice.finallusers();
   }
   
   
   @PostMapping("/login")
   public String loginuser(@RequestBody AccessGuard accessGuard) {
	   System.out.print("Username : "+accessGuard);
	   
	   Authentication authentication = authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(accessGuard.getUsername(), accessGuard.getPassword()));
	   
	   if(authentication.isAuthenticated()) {
		   return userservice.generateToken(accessGuard.getUsername());
	   }
	   return null;
	   
   }
   
   
   @GetMapping("/validate")
   public boolean loginuser(@RequestParam String token) {
	   
	   return userservice.validatetoken(token);
	  
	   
   }

   
   
   

}
