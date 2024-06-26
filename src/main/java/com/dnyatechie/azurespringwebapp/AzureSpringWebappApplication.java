package com.dnyatechie.azurespringwebapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class AzureSpringWebappApplication {

	public static void main(String[] args) {
		SpringApplication.run(AzureSpringWebappApplication.class, args);
	}

	@GetMapping("/message")
	public String message()
	{
		return "Hey Congrats your application deployed successfully deployed to Azure webapp";
	}

}
