package com.example.google.cloud.helloworld_goolgecloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class HelloworldGoolgecloudApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloworldGoolgecloudApplication.class, args);
	}

	@RequestMapping("/")
	public String home() {
		return "Hello World!";
	}

	@RequestMapping("/_ah/health")
	public String healthy() {
		// Message body required though ignored
		return "Still surviving.";
	}
}
