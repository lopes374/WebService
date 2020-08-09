package com.sepol.ApiRest.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import com.sepol.ApiRest.domain.Cadastro;
import com.sepol.ApiRest.reposirories.CadastroRepository;

@Service
public class CadastroService {
	
	@Autowired
	private CadastroRepository repo;
	
	public Page<Cadastro> search(Integer page, Integer linesPerPage, String orderBy, String direction) {
		PageRequest pageRequest = PageRequest.of(page, linesPerPage, Direction.valueOf(direction), orderBy);	
		return repo.findAll(pageRequest);
	}

}
