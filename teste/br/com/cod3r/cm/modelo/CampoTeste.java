package br.com.cod3r.cm.modelo;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CampoTeste { 
	
	
	private Campo campo;  
	
	@BeforeEach
	void iniciarCampo() {
		campo = new Campo(3, 3);
	}
	
	
	@Test
	void testeVizinhoRealDistanciaDireita() {
		Campo vizinho = new Campo(3 , 2);
		boolean resultado = campo.adicionarVizinho(vizinho);
		assertTrue(resultado);
	}
	
	@Test
	void testeVizinhoDistanciaEsquerda() {
		Campo vizinho = new Campo(3 , 4);
		boolean resultado = campo.adicionarVizinho(vizinho);
		assertTrue(resultado);
	}
	
	@Test
	void testeVizinhoDistanciaEmcima() {
		Campo vizinho = new Campo(2 , 3);
		boolean resultado = campo.adicionarVizinho(vizinho);
		assertTrue(resultado);
	}
	
	@Test
	void testeVizinhoDistanciaEmbaixo() {
		Campo vizinho = new Campo(4 , 3);
		boolean resultado = campo.adicionarVizinho(vizinho);
		assertTrue(resultado);
	}
	
	@Test
	void testeVizinholDistancia2() {
		Campo vizinho = new Campo(2 , 2);
		boolean resultado = campo.adicionarVizinho(vizinho);
		assertTrue(resultado);
	}
	
	@Test
	void testeNaoVizinho() {
		Campo vizinho = new Campo(1 , 1);
		boolean resultado = campo.adicionarVizinho(vizinho);
		assertFalse(resultado);
	} 
	
	@Test
	void TesteValorPadraoAtributoMarcado() {
		assertFalse(campo.isMarcada());
	}
	
	@Test
	void TesteAlternarMarcacao() {
		campo.alternarMarcacao();
		assertTrue(campo.isMarcada());
	}
	
	@Test
	void TesteAlternarMarcacaoDuasChamadas() {
		campo.alternarMarcacao();
		campo.alternarMarcacao();
		assertFalse(campo.isMarcada());
	}
	
	@Test
	void TesteAbrirNaoMinadoNaoMarcado() {
		assertTrue(campo.abrir());
	}
	
	@Test
	void TesteAbrirNaoMinadoMarcado() {
		campo.alternarMarcacao();
		assertFalse(campo.abrir());
	}
	
	@Test
	void TesteAbrirMinadoMarcado() {
		campo.alternarMarcacao();
		campo.minar();
		assertFalse(campo.abrir());
	}
	
	
	
	
	
	

}
