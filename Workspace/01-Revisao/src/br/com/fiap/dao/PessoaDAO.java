package br.com.fiap.dao;

import br.com.fiap.bean.Pessoa;

public interface PessoaDAO {
	
	//Tudo que fica na interface será público (ou de acordo com o modificador da classe)
	void gravar(Pessoa pessoa);
	void apagar(int id);
	
}
