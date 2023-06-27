package prim;

public class Aresta implements Comparable<Aresta> {

	private int peso;
	private int nodoOrigen;
	private int nodoDestino;

	public Aresta(int peso, int nodoOrigen, int nodoDestino) {
		this.peso = peso;
		this.nodoOrigen = nodoOrigen;
		this.nodoDestino = nodoDestino;
	}
	
	public int getNodoOrigen() {
		return nodoOrigen;
	}

	public int getNodoDestino() {
		return nodoDestino;
	}

	public int getPeso() {
		return peso;
	}

	@Override
	public String toString() {
		return "Aresta [peso=" + peso + ", nodoOrigen=" + nodoOrigen + ", nodoDestino=" + nodoDestino + "]";
	}

	@Override
	public int compareTo(Aresta otra) {
		return this.peso - otra.peso;
	}

}
