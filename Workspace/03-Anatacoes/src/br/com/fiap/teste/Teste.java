package br.com.fiap.teste;

import java.lang.reflect.Field;

import br.com.fiap.annotation.Coluna;
import br.com.fiap.bean.Cidade;

public class Teste {

	public static void main(String[] args) {
		
		Cidade cidade = new Cidade("Bauru", "SP");
		
		//API Reflection
		//Recuperar o nome da classe
		System.out.println(cidade.getClass().getName());
		
		//Recuperar os atributos da classe
		Field[] atributos = cidade.getClass().getDeclaredFields(); //Se usar o getFields, ir� pegar todos os atributos, inclusive os da classe pai (Object)
		for (Field field : atributos) {
			//Exibe o nome do atributo	
			System.out.println(field.getName());
			//Recuperar a anota��o(JAVA) que est� no atributo
			Coluna anotacao = field.getAnnotation(Coluna.class);
			System.out.println(anotacao.nome());
		}
	}

}
