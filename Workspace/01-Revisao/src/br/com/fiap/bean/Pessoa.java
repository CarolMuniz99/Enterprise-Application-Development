package br.com.fiap.bean;

public abstract class Pessoa {
	//Não será possível istanciar esta classe (dar new), por ser abstrata
	private String nome;

	public void gravar(){
		System.out.println("Gravando...");
	}
	
	public abstract void apagar(); //Não possui chaves/corpo
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
}
