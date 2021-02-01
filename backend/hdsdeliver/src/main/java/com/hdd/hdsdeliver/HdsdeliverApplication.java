package com.hdd.hdsdeliver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;

@SpringBootApplication
@OpenAPIDefinition(info = @Info(title = "API HD Delivery", version = "1.0", description = "API para aplicação HD Delivery"))
public class HdsdeliverApplication {

	public static void main(String[] args) {
		SpringApplication.run(HdsdeliverApplication.class, args);
	}

}
