package prim;

import java.util.List;

public class SalidaPrim {	
	private int pesoTotal;
	private List<Aresta> arbolAbarcadorCostoMinimo;
	
	
	public SalidaPrim(int pesoTotal, List<Aresta> arbolAbarcadorCostoMinimo) {
		this.pesoTotal = pesoTotal;
		this.arbolAbarcadorCostoMinimo = arbolAbarcadorCostoMinimo;
	}


	@Override
	public String toString() {
		System.out.println("Peso total: " + this.pesoTotal);
		System.out.println("Arvore: ");
		for(Aresta a: this.arbolAbarcadorCostoMinimo) {
			System.out.println("Arista: " + a.getNodoDestino() + "  <----->  " + a.getNodoOrigen()  + "  Peso: " + a.getPeso());
		}
		return null;
	}
	
	
	

}
