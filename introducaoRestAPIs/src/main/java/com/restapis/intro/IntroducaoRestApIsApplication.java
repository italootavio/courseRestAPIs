package com.restapis.intro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class IntroducaoRestApIsApplication {

	@GetMapping("/welcome")
	public String welcome() {
		return "Bem vindos ao Curso de Introdução à Rest APIs";
	}
	public static void main(String[] args) {
		SpringApplication.run(IntroducaoRestApIsApplication.class, args);
	}

}
