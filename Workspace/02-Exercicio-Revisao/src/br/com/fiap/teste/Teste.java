package br.com.fiap.teste;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import br.com.fiap.bean.ContaCorrente;
import br.com.fiap.bean.ContaPoupanca;
import br.com.fiap.bean.TipoConta;

public class Teste {

	public static void main(String[] args) {
		//6
		Calendar dataAtual =  Calendar.getInstance(); 
		ContaCorrente cr = new ContaCorrente(2000, 82069, dataAtual, 1500, TipoConta.COMUM);
		ContaPoupanca cp = new ContaPoupanca(2000, 82069, dataAtual, 1800, 10);
		
		
		//7
		List<ContaCorrente> contas = new ArrayList<ContaCorrente>();
		ContaCorrente c1 = new ContaCorrente(2000, 82069, dataAtual, 1200, TipoConta.COMUM);
		ContaCorrente c2 = new ContaCorrente(2000, 82069, dataAtual, 2000, TipoConta.COMUM);
		ContaCorrente c3 = new ContaCorrente(2000, 82069, dataAtual, 1500, TipoConta.COMUM);
		
		contas.add(c1);
		contas.add(c2);
		contas.add(c3);
		
		System.out.println("Saldos : "+c1.getSaldo() + "\n" + c2.getSaldo() + "\n" + c3.getSaldo());
	}

}
