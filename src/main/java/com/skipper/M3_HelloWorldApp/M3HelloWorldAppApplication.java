package com.skipper.M3_HelloWorldApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class M3HelloWorldAppApplication {
	
	@GetMapping("/show")
	  public String Message() {
	    return "Hello Docker World! This is Kaushik!";
	  }

	public static void main(String[] args) {
		SpringApplication.run(M3HelloWorldAppApplication.class, args);
	}

}
