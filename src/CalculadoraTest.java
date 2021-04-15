import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import junit.framework.Assert;

class CalculadoraTest {

	@SuppressWarnings("deprecation")
	@Test
	void testMetodoSoma() {
		final double resultadoSoma = Calculadora.Soma(1, 2);
		final double resultadoEsperado = 1+2;
		
		Assert.assertEquals(resultadoEsperado, resultadoSoma);
				
	}
	@SuppressWarnings("deprecation")
	@Test
	void testMetodoSomaABS() {
		final double resultadoSoma = Calculadora.SomaAbs(1.5, 1.5);
		final double resultadoEsperado = 1.5+1.5;
		
		Assert.assertEquals(resultadoEsperado, resultadoSoma);
	}	
	@SuppressWarnings("deprecation")
	@Test
	void testPotencia() {
		final double resultadoPotencia = Calculadora.Potencia(2,2);
		final double resultadoEsperado = 4;
		
		Assert.assertEquals(resultadoEsperado, resultadoPotencia);
	}
	

}
