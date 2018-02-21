package br.com.fiap.bean;

import java.util.Calendar;

public class ContaCorrente extends Conta{
	private TipoConta tipo;
	
	public ContaCorrente() {
		super();
	}

	public ContaCorrente(int agencia, int numero, Calendar dataAbertura, double saldo, TipoConta tipo) {
		super(agencia, numero, dataAbertura, saldo);
		this.tipo = tipo;
	}

	public TipoConta getTipo() {
		return tipo;
	}

	public void setTipo(TipoConta tipo) {
		this.tipo = tipo;
	}

	@Override
	public void depositar(double valor) {
		this.setSaldo(this.getSaldo() + valor);
	}

	@Override
	public void retirar(double valor) {
		
		if (this.tipo == TipoConta.COMUM && (this.getSaldo() - valor) < 0) {
			Exception e = new Exception("Seu saldo não é suficiente!");
			System.out.println(e.getMessage());
		} else {
			this.setSaldo(this.getSaldo() - valor);
		}
	}
	
}
