package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@RestController
public class DemoApplication {

	@GetMapping("/")
	Public String welcome() {
		return "Welcome to this spring boot-Openshift Demo";
	}

	@GetMapping("/{input}")
	Public String congrats(@PathVariable String input) {
		return "Hello" + input + " Good Job, Your apllication is running...";
	}


	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}
