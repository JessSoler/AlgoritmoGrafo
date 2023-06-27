class Aresta implements Comparable<Aresta>{
    private int custo;
    private No tabaOrigem;
    private No tabaDestino;

    public  Aresta( No t1, No t2, int c){
        this.tabaOrigem = t1;
        this.tabaDestino = t2;
        this.custo = c;
    }

    public No getTabaDestino() {
        return tabaDestino;
    }

    public No getTabaOrigem() {
        return tabaOrigem;
    }

    public int getCusto() {
        return custo;
    }
    @Override
    public int compareTo(Aresta aresta) {
        return custo - aresta.custo;
    }
}