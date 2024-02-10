package com.springboot.first.app;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
	//GET HTTP METHOD
	//http://localhost:8080/hello-world
	
//	private static final String PATH = "/error";
//
//    @RequestMapping(value = PATH)
//    public String error() {
//        return "Error handling";
//    }
	
	@GetMapping("/hello-world")
	public String helloworld() {
		return "Hello World!";
	}

}
