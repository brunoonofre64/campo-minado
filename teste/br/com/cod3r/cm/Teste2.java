package br.com.cod3r.cm;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Teste2 {

	@Test
	void testarSeIgualADois() {
		
		int a = 2;
		
		assertEquals(a , 2);
	}
	
	@Test
	void testarSeIgualATres() {
		
		int x = 2 + 10 - 9;
		
		assertEquals(3, x);
	}

}
