package com.example.FiegnClient.Interface;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.FiegnClient.DTOS.Atmpojo;

@FeignClient(value = "Securityservice",url = "http://localhost:8060/user")
public interface Fiegnclientinterface {
	
	
	
	
	@GetMapping("/get")
	public List<?> getusers();
	
	
	

}
