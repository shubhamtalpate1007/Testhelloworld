package com.example.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class helloController {

	@GetMapping("/hello")
	public String helloworld() {

		return "hey hi friends i updated this project ok";

	}

	public String printString() {

		return "Test-3";//using git bash 
	}

}
