package com.controller;

import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/")
@CrossOrigin(origins = "http://127.0.0.1:5500")
public class BasicAuthController {
	
	@GetMapping("/login")
	public String Login(Authentication authentication) {
		String userName = authentication.getName();
		
		return "Welcome " + userName;
	}
	
}
