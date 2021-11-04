package br.com.samuelhsena.dao;

import org.springframework.stereotype.Repository;

import br.com.samuelhsena.domain.Funcionario;

@Repository
public class FuncionarioDaoImpl extends AbstractDao<Funcionario, Long> implements FuncionarioDao {

}
