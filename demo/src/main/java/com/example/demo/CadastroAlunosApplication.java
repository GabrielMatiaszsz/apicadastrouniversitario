package com.example.demo;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@OpenAPIDefinition(info = @Info(title = "API Cadastro Aluno", version = "1.0", description = "Documentação da API"))
public class CadastroAlunosApplication {

	public static void main(String[] args) {
		SpringApplication.run(CadastroAlunosApplication.class, args);
	}

}
