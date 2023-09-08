package br.com.back.dao;

import org.springframework.data.repository.CrudRepository;

import br.com.back.modelo.AlunoModelo;

public interface AlunoDAO extends CrudRepository<AlunoModelo, Integer>{
    
}
