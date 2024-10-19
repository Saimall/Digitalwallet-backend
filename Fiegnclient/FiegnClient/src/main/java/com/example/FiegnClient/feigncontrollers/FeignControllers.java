package com.example.FiegnClient.feigncontrollers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.FiegnClient.DTOS.Atmpojo;
import com.example.FiegnClient.Interface.Fiegnclientinterface;

@RestController
@RequestMapping("/client")
public class FeignControllers {

	@Autowired
	Fiegnclientinterface fiegnclientinterface;
	
	@GetMapping("/home")
	public String Greet() {
		return "Hello world";
	}
	
	
	@GetMapping("/getusers")
	public List<?> getatm() {
		return fiegnclientinterface.getusers();
	}
	
	
	
	
}
