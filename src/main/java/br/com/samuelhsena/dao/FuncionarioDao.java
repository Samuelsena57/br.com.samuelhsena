package br.com.samuelhsena.dao;

import java.util.List;

import br.com.samuelhsena.domain.Funcionario;


public interface FuncionarioDao {

	
		void save (Funcionario funcionario);
		
		void update(Funcionario funcionario);
		
		void delete(Long id);
		
		Funcionario findById(Long id);
		
		List<Funcionario> findAll();
}
