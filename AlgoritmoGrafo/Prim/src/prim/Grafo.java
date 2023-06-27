package prim;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Random;

public class Grafo {
	private List<Nodo> nodos;
	private int cantDeNodos;
	private ListaDeAdyacencia listaDeAdyacencia;

	public Grafo(int cantDeNodos) {
		this.cantDeNodos = cantDeNodos;
		this.nodos = new ArrayList<>();

		for (int i = 0; i < cantDeNodos; i++) {
			nodos.add(new Nodo(i));
		}

		this.listaDeAdyacencia = new ListaDeAdyacencia(cantDeNodos);
	}

	public void setValor(int nodoI, int nodoJ, int peso) {
		this.listaDeAdyacencia.setValor(nodoI, nodoJ, peso);
	}

	public SalidaPrim calcularPrim() {
		List<Integer> nodosConectados = new LinkedList<>();
		int pesoTotal = 0, nodoActual = 0;
		PriorityQueue<Aresta> colaNodoArista = new PriorityQueue<>();
		List<Aresta> arbolAbarcadorCostoMinimo = new LinkedList<>();
		Aresta aristaAux;
		
		nodosConectados.add(nodoActual);

		while (nodosConectados.size() != this.cantDeNodos) {
			for (Aresta a : this.listaDeAdyacencia.getValor(nodoActual)) {
				colaNodoArista.add(a);
			}

			aristaAux = colaNodoArista.poll();
			while (nodosConectados.contains(aristaAux.getNodoDestino())) {
				aristaAux = colaNodoArista.poll();
			}
			
			nodoActual = aristaAux.getNodoDestino();
			arbolAbarcadorCostoMinimo.add(aristaAux);
			pesoTotal += aristaAux.getPeso();
			nodosConectados.add(nodoActual);
			
		}

		return new SalidaPrim(pesoTotal, arbolAbarcadorCostoMinimo);
	}

}
