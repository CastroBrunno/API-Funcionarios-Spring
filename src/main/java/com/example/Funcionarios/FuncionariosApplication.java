package com.example.Funcionarios;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FuncionariosApplication {

	public static void main(String[] args) {
		SpringApplication.run(FuncionariosApplication.class, args);
		System.out.println("Server is running on port 8080");
	}

}
