package com.example.jenkinsbuilddemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	
	@GetMapping(path="/")
	public String getMessgae() {
		return "Welcome message from jenkins demo build";
	}

}
