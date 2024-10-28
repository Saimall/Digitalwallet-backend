package com.example.owner.config;

import org.springframework.context.annotation.Configuration;


import com.cloudinary.Cloudinary;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;


import java.util.Map;

@Configuration
public class CloudinaryConfig {



	    @Value("${cloudinary.cloud.name}")
	    private String cloudName;

	    @Value("${cloudinary.api.key}")
	    private String apiKey;

	    @Value("${cloudinary.api.secret}")
	    private String apiSecret;
	   

	    @Bean
	    public Cloudinary cloudinary() {
	        return new Cloudinary(Map.of(
	            "cloud_name", "dfkswortx",
	            "api_key", "565149476194521",
	            "api_secret", "e25qJWUBj-JFvYoGTLjkUF80Ksg"
	        ));
	    }
	}



