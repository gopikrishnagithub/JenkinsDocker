package com.devoops;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DevoopsJenkinsDockerApplication {

	public static void main(String[] args) {
		SpringApplication.run(DevoopsJenkinsDockerApplication.class, args);
		
		System.out.println("Project started......");
	}
	
	@GetMapping("/getvalue")
	public String getValue() {
		return "Hi welcome";
	}

}
