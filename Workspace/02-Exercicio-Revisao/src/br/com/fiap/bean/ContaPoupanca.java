package br.com.fiap.bean;

import java.util.Calendar;

public class ContaPoupanca extends Conta implements ContaInvestimento{

	private float taxa;
	private static final float rendimento = 10;
	
	public ContaPoupanca() {
		super();
	}

	public ContaPoupanca(int agencia, int numero, Calendar dataAbertura, double saldo, float taxa) {
		super(agencia, numero, dataAbertura, saldo);
		this.taxa = taxa;
	}

	public float getTaxa() {
		return taxa;
	}

	public void setTaxa(float taxa) {
		this.taxa = taxa;
	}

	public static float getRendimento() {
		return rendimento;
	}

	@Override
	public double calculaRetornoInvestimento() {
		return this.getSaldo() * rendimento;
	}

	@Override
	public void depositar(double valor) {
		this.setSaldo(this.getSaldo() + valor);
	}

	@Override
	public void retirar(double valor) {
		if ((this.getSaldo() - (valor+this.taxa)) > 0) {
			this.setSaldo(this.getSaldo() - (valor+this.taxa));
		} else {
			Exception e = new Exception("Seu saldo não é suficiente!");
			System.out.println(e.getMessage());
		}
	}

}
