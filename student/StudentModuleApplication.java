package com.tns.student;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication

public class StudentModuleApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudentModuleApplication.class, args);
		
	}

}
