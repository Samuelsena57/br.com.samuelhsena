package br.com.samuelhsena.dao;

import java.util.List;

import br.com.samuelhsena.domain.Cargo;


public interface CargoDao {
	
	void save (Cargo cargo);
	
	void update(Cargo Cargo);
	
	void delete(Long id);
	
	Cargo findById(Long id);
	
	List<Cargo> findAll();

}
