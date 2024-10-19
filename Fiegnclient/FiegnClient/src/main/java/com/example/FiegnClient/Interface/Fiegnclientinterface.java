package com.example.FiegnClient.Interface;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.FiegnClient.DTOS.Atmpojo;

@FeignClient(value = "Securityservice",url = "http://localhost:9097")
public interface Fiegnclientinterface {
	
	
	
	
	@GetMapping("user/get")
	public List<?> getusers();
	
	
	

}
