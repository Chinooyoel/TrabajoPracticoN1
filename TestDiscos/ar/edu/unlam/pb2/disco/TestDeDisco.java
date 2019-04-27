package ar.edu.unlam.pb2.disco;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import junit.framework.Assert;

class TestDeDisco {


	@Test
	public void testParaQueUnDiscoTengaRadioInterior() {
		
		Disco discoPrueba = new Disco(6.55,7);
		
		double radioInteriorEsperado = 6.55;
		
		double radioInteriorObtenido = discoPrueba.getRadioInterior();
		
		Assert.assertEquals(radioInteriorEsperado,radioInteriorObtenido);
		
	}
	
	@Test
	public void testParaQueUnDiscoTengaRadioExterior() {
		
		Disco discoPrueba = new Disco(6.55,7);
		
		double radioExteriorEsperado = 7;
		
		double radioExteriorObtenido = discoPrueba.getRadioExterior();
		
		Assert.assertEquals(radioExteriorEsperado,radioExteriorObtenido);
		
	}
	
	@Test
	public void testParaQueUnDiscoTengaPerimetroInterior() {
		
		Disco discoPrueba = new Disco(6.55,7);
		
		double perimetroInteriorEsperado = discoPrueba.calcularPerimetroDeUnCirculo(6.55);
		
		double perimetroInteriorObtenido = discoPrueba.calcularPerimetroInteriorDelDisco();
		
		Assert.assertEquals(perimetroInteriorEsperado, perimetroInteriorObtenido);
		
	}
	
	@Test
	public void testParaQueUnDiscoTengaPerimetroExterior() {
		
		Disco discoPrueba = new Disco(6.55,7);
		
		double perimetroExteriorEsperado = discoPrueba.calcularPerimetroDeUnCirculo(7);
		
		double perimetroExteriorObtenido = discoPrueba.calcularPerimetroExteriorDelDisco();
		
		Assert.assertEquals(perimetroExteriorEsperado, perimetroExteriorObtenido);
		
	}
	
	@Test
	public void testParaQueUnDiscoTengaSuperficie() {
		
		Disco discoPrueba = new Disco(6.55,7);
		
		double superficieInterna = discoPrueba.calcularSuperficieDeUnCirculo(6.55);
		double superficieExterna = discoPrueba.calcularSuperficieDeUnCirculo(7);
		double superficieEsperada = superficieInterna + superficieExterna;
		double superficieObtenida = discoPrueba.calcularSuperficieDelDisco();
		
		assertEquals(superficieObtenida , superficieEsperada);
	}
}
