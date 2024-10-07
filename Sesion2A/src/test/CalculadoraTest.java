package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import clase.Calculadora;

class CalculadoraTest {
	int valor1=5;
	int valor2=3;
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testSuma() {
		//fail("Not yet implemented");
		int valor_esperado=8;
		int resultado = Calculadora.suma(valor1, valor2);
		assertEquals(valor_esperado, resultado, "5+3=8");
	}

	@Test
	void testResta() {
		int valor_esperado=2;
		int resultado = Calculadora.resta(valor1, valor2);
		assertEquals(valor_esperado, resultado, "5-3=2");
	}

	@Test
	void testMultiplica() {
		int valor_esperado=15;
		int resultado = Calculadora.multiplica(valor1, valor2);
		assertEquals(valor_esperado, resultado, "5*3=15");
	}

	@Test
	void testDivide() {
		int valor_esperado=1;
		int resultado = Calculadora.divide(valor1, valor2);
		assertEquals(valor_esperado, resultado, "5/3=1");
	}

}
