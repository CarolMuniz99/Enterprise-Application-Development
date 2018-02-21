package br.com.fiap.bean;

import java.util.Calendar;

public class ContaPoupanca extends Conta implements ContaInvestimento{

	private float taxa;
	private static final float RENDIMENTO = 0.005f; //f é para fazer o cast para float, pois o Java interpreta todo número com casas decimais como Double

	public ContaPoupanca(float taxa) {
		super();
		this.taxa = taxa;
	}

	public ContaPoupanca(int agencia, int numero, Calendar dataAbertura, double saldo, float taxa) {
		super(agencia, numero, dataAbertura, saldo);
		this.taxa = taxa;
	}

	@Override
	public double calculaRetornoInvestimento() {
		return saldo*RENDIMENTO;
	}

	@Override
	public void retirar(double valor) throws Exception {
		if (saldo >= valor + taxa) {
			saldo -= valor + taxa;
		}else{
			throw new Exception("Saldo insuficiente!");
		}
		
	}

	public float getTaxa() {
		return taxa;
	}

	public void setTaxa(float taxa) {
		this.taxa = taxa;
	}

}
