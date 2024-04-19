package com.jenkins;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JenkinsTestingProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(JenkinsTestingProjectApplication.class, args);
		System.out.println("Inside The Main Application");
		System.out.println("Jenkins Project working fine");
	}

}
