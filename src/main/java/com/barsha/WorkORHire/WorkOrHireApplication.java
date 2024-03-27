package com.barsha.WorkORHire;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.barsha"}) 
public class WorkOrHireApplication {
	public static void main(String[] args) {
		SpringApplication.run(WorkOrHireApplication.class, args);
	}
}
