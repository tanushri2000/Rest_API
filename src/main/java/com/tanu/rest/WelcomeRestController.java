package com.tanu.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeRestController {
	
	@GetMapping("/welcome")
	public String getWelcome() {
		return "welcome to Tanus home";
	}
	
	@GetMapping("/greet")
	public String getGreet() {
		return "Good Morning";
	}
			

}
