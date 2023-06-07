package com.innowise.springemployeedataaccounting;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = { SecurityAutoConfiguration.class })
public class SpringEmployeeDataAccountingApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringEmployeeDataAccountingApplication.class, args);
	}

}
