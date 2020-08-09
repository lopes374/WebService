package com.sepol.ApiRest.reposirories;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.sepol.ApiRest.domain.Cadastro;

@Repository
public interface CadastroRepository extends JpaRepository<Cadastro, Integer>, CadastroCustomRepository{
	
//	@Transactional(readOnly=true)
//	@Query("SELECT cad FROM Cadastro cad WHERE cad.status = :status" )
//	public Page<Cadastro> findCustomCadastro(@Param("status") boolean status, Integer page, Integer linesPerPage, String orderBy, String direction);
	
	@Transactional(readOnly=true)
	@Query("SELECT cad FROM Cadastro cad WHERE cad.status = :status" )
	public Page<Cadastro> findStatus(@Param("status") boolean status, Pageable page);

}
