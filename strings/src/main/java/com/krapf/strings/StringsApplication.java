package com.krapf.strings;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
@RestController
public class StringsApplication {

	public static void main(String[] args) {
		SpringApplication.run(StringsApplication.class, args);
	}
	
	@RequestMapping("/")
	public String stringOne() {
		return "Hello Client! How are you doing?";
	}
	
	@RequestMapping("/random")
	public String stringTwo() {
		return "Spring Boot is great! So oesy to just respond with strings";
	}
}
