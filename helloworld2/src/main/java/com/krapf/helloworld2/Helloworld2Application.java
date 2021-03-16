package com.krapf.helloworld2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
@RestController
public class Helloworld2Application {

	public static void main(String[] args) {
		SpringApplication.run(Helloworld2Application.class, args);
	}
	
	@RequestMapping("/")
	public String hello() {
		return "Hello World";
	}

}
