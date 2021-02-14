package com.bank;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
@Configuration

public class StateBankApplication {

	public static void main(String[] args) {
		SpringApplication.run(StateBankApplication.class, args);
	}

}
