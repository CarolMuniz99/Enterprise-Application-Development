package br.com.fiap.bean;

import br.com.fiap.annotation.Tabela;

@Tabela(nome="TAB_ALUNO")
public class Aluno {
	
	private String nome;
	private int matricula;
	
	public Aluno() {
		super();
	}
	public Aluno(String nome, int matricula) {
		super();
		this.nome = nome;
		this.matricula = matricula;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getMatricula() {
		return matricula;
	}
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
}
