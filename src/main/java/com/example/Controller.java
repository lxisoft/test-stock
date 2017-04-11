package com.example;

import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	
	@RequestMapping("/home")
	public String hello(){
		return "Hello WOrld ";
	}

	@RequestMapping("/new")
	public String stock(){
		return "implementing stock ";
	}
}
