package com.bank.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class LoginController {
	
	@GetMapping("/")
	public String home() {
		return " <h1>hello world </h1>";
	}
	@GetMapping("/register")
	public String register() {
		return "Resgiter Here";
	}
	
	@GetMapping("/admin")
	public String login() {
		return "Admin Form here";
	}
	


}
