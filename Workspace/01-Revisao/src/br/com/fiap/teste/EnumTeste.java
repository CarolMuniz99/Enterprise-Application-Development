package br.com.fiap.teste;

import br.com.fiap.bean.Estado;

public class EnumTeste {

	public static void main(String[] args) {
		Estado uf = Estado.RS;
		
		if(uf == Estado.RS){
			System.out.println("Você é gaúcho, tche!");
		}else{
			System.out.println("Você não é gaúcho, tche!");
		}
	}

}
