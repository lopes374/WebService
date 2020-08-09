package com.sepol.ApiRest;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.sepol.ApiRest.domain.Cadastro;
import com.sepol.ApiRest.reposirories.CadastroRepository;

@SpringBootApplication
public class ApiRestApplication implements CommandLineRunner {
	
	@Autowired
	private CadastroRepository cadastroRepository;

	public static void main(String[] args) {
		SpringApplication.run(ApiRestApplication.class, args);	
		
	}

	@Override
	public void run(String... args) throws Exception {
		
		Cadastro cad1 = new Cadastro(null, "Alex Lopes 1", true);
		Cadastro cad2 = new Cadastro(null, "Alex Lopes 2", false);
		Cadastro cad3 = new Cadastro(null, "Alex Lopes 3", false);
		Cadastro cad4 = new Cadastro(null, "Alex Lopes 4", false);
		Cadastro cad5 = new Cadastro(null, "Alex Lopes 5", false);
		Cadastro cad6 = new Cadastro(null, "Alex Lopes 6", false);
		Cadastro cad7 = new Cadastro(null, "Alex Lopes 7", false);
		Cadastro cad8 = new Cadastro(null, "Alex Lopes 8", false);
		Cadastro cad9 = new Cadastro(null, "Alex Lopes 9", false);
		Cadastro cad10 = new Cadastro(null, "Alex Lopes 10", true);
		Cadastro cad11 = new Cadastro(null, "Alex Lopes 11", true);
		Cadastro cad12 = new Cadastro(null, "Alex Lopes 12", true);
		Cadastro cad13 = new Cadastro(null, "Alex Lopes 13", true);
		Cadastro cad14 = new Cadastro(null, "Alex Lopes 14", true);
		Cadastro cad15 = new Cadastro(null, "Alex Lopes 15", true);
		
		cadastroRepository.saveAll(Arrays.asList(
				cad1, cad2, cad3, cad4, cad5, cad6, cad7, cad8, cad9, cad10, cad11, cad12, cad13, cad14, cad15));
		
	}
		
		

}
