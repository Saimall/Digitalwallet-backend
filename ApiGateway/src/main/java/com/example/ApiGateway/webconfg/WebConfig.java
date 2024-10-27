//package com.example.ApiGateway.webconfg;
//
//
//import org.springframework.context.annotation.Configuration;
//import org.springframework.web.servlet.config.annotation.CorsRegistry;
//import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
//
//@Configuration
//public class WebConfig implements WebMvcConfigurer {
//
//    @Override
//	    public void addCorsMappings(CorsRegistry registry) {
//	        registry.addMapping("/**") // Allow CORS for all paths
//	                .allowedOrigins("http://localhost:4200") // Your frontend URL
//	                .allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS") // Allowed methods
//	                .allowedHeaders("*") // Allow all headers
//	                .allowCredentials(true) // Allow credentials (optional)
//	                .maxAge(3600); // Preflight cache duration (optional)
//	    }
//     
//}
//
