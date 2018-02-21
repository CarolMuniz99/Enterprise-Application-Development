package br.com.fiap.teste;

import br.com.fiap.annotation.Tabela;
import br.com.fiap.bean.Aluno;

public class Teste1 {

	public static void main(String[] args) {
		
		Aluno aluno = new Aluno("Caroline", 77868);
		
		Tabela anotacao = aluno.getClass().getAnnotation(Tabela.class);
		
		System.out.println("SELECT * FROM " + anotacao.nome());
	}

}
