package br.com.marcotuliocafe.dao;

import org.springframework.stereotype.Repository;

import br.com.marcotuliocafe.domain.Funcionario;

@Repository
public class FuncionarioDaoImpl extends AbstractDao<Funcionario, Long> implements FuncionarioDao {

}
