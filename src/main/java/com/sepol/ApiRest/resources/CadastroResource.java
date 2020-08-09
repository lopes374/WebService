package com.sepol.ApiRest.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sepol.ApiRest.domain.Cadastro;
import com.sepol.ApiRest.dto.CadastroDTO;
import com.sepol.ApiRest.reposirories.impl.CadastroCustomRepositoryImpl;

@RestController
@RequestMapping(value = "/cadastro")
public class CadastroResource {
	
	@Autowired
	private CadastroCustomRepositoryImpl repo;
	
//	@Autowired
//	private CadastroService service;
	
	@RequestMapping(value="/page", method=RequestMethod.GET)
	public ResponseEntity<Page<CadastroDTO>> findPage(
			@RequestParam(value = "status", defaultValue = "true") boolean status,
			@RequestParam(value = "pagina", defaultValue = "0") int page,
			@RequestParam(value = "tamanho", defaultValue = "24") int size,
			@RequestParam(value = "orderBy", defaultValue = "nome") String orderBy,
			@RequestParam(value = "direction", defaultValue = "ASC") String direction){		
		Page<Cadastro> list = repo.findCustomCadastro(status, page, size, orderBy, direction);
		Page<CadastroDTO> listDto = list.map(obj -> new CadastroDTO(obj)); 
		return ResponseEntity.ok().body(listDto);
	}
	
//	@RequestMapping(value="/page", method=RequestMethod.GET)
//	public ResponseEntity<Page<CadastroDTO>> findPage(
//			@RequestParam(value="page", defaultValue="0") Integer page, 
//			@RequestParam(value="linesPerPage", defaultValue="5") Integer linesPerPage, 
//			@RequestParam(value="orderBy", defaultValue="nome") String orderBy, 
//			@RequestParam(value="direction", defaultValue="ASC") String direction) {
//		Page<Cadastro> list = service.search(page, linesPerPage, orderBy, direction);
//		Page<CadastroDTO> listDto = list.map(obj -> new CadastroDTO(obj));  
//		return ResponseEntity.ok().body(listDto);
//	}
	
	

}
