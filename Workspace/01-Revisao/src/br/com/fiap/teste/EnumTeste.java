package br.com.fiap.teste;

import br.com.fiap.bean.Estado;

public class EnumTeste {

	public static void main(String[] args) {
		Estado uf = Estado.RS;
		
		if(uf == Estado.RS){
			System.out.println("Voc� � ga�cho, tche!");
		}else{
			System.out.println("Voc� n�o � ga�cho, tche!");
		}
	}

}
