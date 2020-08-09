package com.sepol.ApiRest.reposirories.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort.Direction;

import com.sepol.ApiRest.domain.Cadastro;
import com.sepol.ApiRest.reposirories.CadastroCustomRepository;
import com.sepol.ApiRest.reposirories.CadastroRepository;

public class CadastroCustomRepositoryImpl implements CadastroCustomRepository {
	
	@Autowired
	private CadastroRepository repo;

	@Override
	public Page<Cadastro> findCustomCadastro(boolean status, Integer page, Integer linesPerPage, String orderBy, String direction) {
		PageRequest pageRequest = PageRequest.of(page, linesPerPage, Direction.valueOf(direction), orderBy);
		return repo.findStatus(status, pageRequest);
	}
	

}
