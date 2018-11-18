package com.example.Docker.HelloPerson;



import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class HelloPers {
	
	@GetMapping("/hello/{name}")
	public String HelloWorld(@PathVariable("name") String name) {
		return "Hello " + name;
	}
	
	
}
