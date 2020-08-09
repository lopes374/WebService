package com.sepol.ApiRest.reposirories;

import org.springframework.data.domain.Page;

import com.sepol.ApiRest.domain.Cadastro;

public interface CadastroCustomRepository {
	
	Page<Cadastro> findCustomCadastro(boolean status, Integer page, Integer linesPerPage, String orderBy, String direction);

}
	