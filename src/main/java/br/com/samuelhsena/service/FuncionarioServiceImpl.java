package br.com.samuelhsena.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.samuelhsena.dao.FuncionarioDao;
import br.com.samuelhsena.domain.Funcionario;

@Transactional(readOnly = true)
@Service
public class FuncionarioServiceImpl implements FuncionarioService {

	@Autowired
	private FuncionarioDao dao;
	
	@Transactional(readOnly = false)
	@Override
	public void salvar(Funcionario funcionario) {
		dao.save(funcionario);
		
	}

	@Transactional(readOnly = false)
	@Override
	public void editar(Funcionario funcionario) {
		dao.update(funcionario);
		
	}

	@Transactional(readOnly = false)
	@Override
	public void excluir(Long id) {
		dao.delete(id);
		
	}

	@Override
	public Funcionario buscarPorId(Long id) {
		
		return dao.findById(id);
	}

	@Override
	public List<Funcionario> buscartodos() {
		
		return dao.findAll();
	}

}
