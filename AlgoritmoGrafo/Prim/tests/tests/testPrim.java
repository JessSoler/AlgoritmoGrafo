package tests;

import org.junit.Test;

import prim.Grafo;
import prim.SalidaPrim;

public class testPrim {
	
	@Test
	public void testEnunciadoMetro() {
		Grafo gPrim = new Grafo(6);
		
		gPrim.setValor(0, 1, 1);
		gPrim.setValor(1, 2, 1);
		gPrim.setValor(3, 4, 1);

		gPrim.setValor(0, 2, 0);
		gPrim.setValor(2, 3, 0);
		gPrim.setValor(3, 5, 0);
		gPrim.setValor(4, 5, 0);
		
		SalidaPrim salida = gPrim.calcularPrim();
		salida.toString();
		
	}
	
	@Test
	public void testEjemploEnClase() {
		Grafo gPrim = new Grafo(7);
		
		gPrim.setValor(0, 1, 2);
		gPrim.setValor(0, 3, 1);
		gPrim.setValor(0, 2, 4);
		
		gPrim.setValor(2, 3, 2);
		gPrim.setValor(2, 5, 5);
		gPrim.setValor(5, 3, 8);
		gPrim.setValor(5, 6, 1);
		gPrim.setValor(3, 1, 3);
		gPrim.setValor(3, 4, 7);
		gPrim.setValor(3, 6, 4);
		gPrim.setValor(1, 4, 10);
		gPrim.setValor(6, 4, 6);
		
		
		SalidaPrim salida = gPrim.calcularPrim();
		
		salida.toString();
		
	}


}
