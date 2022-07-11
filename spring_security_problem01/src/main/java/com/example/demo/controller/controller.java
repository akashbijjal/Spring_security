package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controller {

	
	
	@RequestMapping("/nope")
	public String helloworld()
	{
		return "hello world!!!";
	}
	
}
	