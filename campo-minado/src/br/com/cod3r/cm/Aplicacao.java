package br.com.cod3r.cm;

import br.com.cod3r.cm.modelo.Tabuleiro;

public class Aplicacao { 
	
	public static void main(String[] args) {
		
		Tabuleiro tabuleiro = new Tabuleiro(6, 6, 6);
		
		tabuleiro.alternarMaracacao(4, 4);
		tabuleiro.alternarMaracacao(4, 5);
		tabuleiro.abrir(3, 3);
		
		System.out.println(tabuleiro);
	}

}
