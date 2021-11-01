package br.com.cod3r.cm.visao;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

import br.com.cod3r.cm.excecao.ExplosaoException;
import br.com.cod3r.cm.excecao.SairExcepetion;
import br.com.cod3r.cm.modelo.Tabuleiro;

public class TabuleiroConsole {
	
	private Tabuleiro tabuleiro;
	private Scanner entrada = new Scanner(System.in);
	
	public TabuleiroConsole(Tabuleiro tabuleiro) {
		this.tabuleiro = tabuleiro;
		
		executarJogo();
	}
	
	

	private void executarJogo() {
		try {
			boolean continuar = true;
			
			while(continuar) {
				cicloDoJogo();
				
				System.out.println("Outra partida? (S/n) ");
				String resposta = entrada.nextLine();
				
				if("n".equalsIgnoreCase(resposta)) {
					continuar = false;
				} else {
					tabuleiro.reiniciar();
				}
			}
		} catch (SairExcepetion e) {
			System.out.println("Tchau!!!");
		} finally {
			entrada.close();
		}
	}



	private void cicloDoJogo() {
		try {
			
			while(!tabuleiro.objetivoAlcancado()) {
				System.out.println(tabuleiro);
				
				String digitado = capturarValorDigitado("Digite (x, y): ");
				
				
			Iterator<Integer> xy = Arrays.stream(digitado.split(","))
				      .map(e -> Integer.parseInt(e.trim())).iterator();
			
			digitado = capturarValorDigitado("! - Abrir - 2 - (Des)Marcar: ");
			
			if("1".equals(digitado)) {
				tabuleiro.abrir(xy.next(), xy.next());
			} else if("2".equals(digitado)) {
				tabuleiro.alternarMaracacao(xy.next(), xy.next());
				
			}
				
		}
			
			System.out.println("Voc� ganhou!");
		} catch(ExplosaoException e) {
			System.out.println("Voc� perdeu!");
		}
	}
    
	private String capturarValorDigitado(String texto) {
		System.out.println(texto);
		String digitado = entrada.nextLine();
		
		if("sair".equalsIgnoreCase(digitado)) {
			throw new SairExcepetion();
		}
		
		return digitado;
	}
}
