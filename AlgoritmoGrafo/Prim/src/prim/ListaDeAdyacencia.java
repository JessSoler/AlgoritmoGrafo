package prim;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListaDeAdyacencia {

	private List<List<Aresta>> arrayAdyacenciaNodo;

	public ListaDeAdyacencia(int cantNodos) {

		this.arrayAdyacenciaNodo = new ArrayList<>();

		for (int i = 0; i < cantNodos; i++) {
			arrayAdyacenciaNodo.add(new LinkedList<>());
		}

	}

	public void setValor(int nodoI, int nodoJ, int peso) {
		if(nodoI==nodoJ) {
			return;
		}
		this.arrayAdyacenciaNodo.get(nodoI).add(new Aresta(peso, nodoI, nodoJ));
		this.arrayAdyacenciaNodo.get(nodoJ).add(new Aresta(peso, nodoJ, nodoI));
	}
	
	public List<Aresta> getValor(int nodoI) {
		return this.arrayAdyacenciaNodo.get(nodoI);
	}
	
	public int getValor(int nodoI, int nodoJ) {
		
		for(Aresta a: this.arrayAdyacenciaNodo.get(nodoI)) {
			if(a.getNodoDestino() == nodoJ) {
				return a.getPeso();
			}
		}
		
		return -1;
	}

}
