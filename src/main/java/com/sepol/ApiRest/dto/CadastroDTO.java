package com.sepol.ApiRest.dto;

import java.io.Serializable;

import com.sepol.ApiRest.domain.Cadastro;

public class CadastroDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private Integer id;
	private String nome;
	private boolean status;
	
	public CadastroDTO() {
	
	}

	public CadastroDTO(Cadastro obj) {
		id = obj.getId();
		nome = obj.getNome();
		status = obj.getStatus();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

}
