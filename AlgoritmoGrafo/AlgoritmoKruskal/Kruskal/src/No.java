import java.util.ArrayList;

class No {
    private int numero;
    private ArrayList<No> vizinhos;

    public  No(int num){
        this.numero = num;
        this.vizinhos = new ArrayList<No>();
    }
    public void vinculaVizinho(No vizinho) {
        vizinhos.add(vizinho);
    }
    public int getNumero() {
        return numero;
    }
    public ArrayList<No> getVizinhos() {
        return vizinhos;
    }
    public  boolean ehVizinho(No x){
        return vizinhos.contains(x);
    }
}
