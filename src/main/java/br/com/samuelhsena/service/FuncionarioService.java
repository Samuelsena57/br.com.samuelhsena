package br.com.samuelhsena.service;

import java.util.List;

import br.com.samuelhsena.domain.Funcionario;

public interface FuncionarioService {
	
void salvar(Funcionario funcionario);
	
	void editar(Funcionario funcionario);
	
	void excluir(Long id);
	
	Funcionario buscarPorId(Long id);
	
	List<Funcionario> buscartodos();

}
