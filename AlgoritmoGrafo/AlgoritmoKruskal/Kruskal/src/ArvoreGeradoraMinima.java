import java.util.ArrayList;
import java.util.HashSet;

class ArvoreGeradoraMinima {

    private ArrayList<Aresta> aresta;
    private HashSet nos;

    public  ArvoreGeradoraMinima(){
        aresta = new ArrayList<Aresta>();
        nos = new HashSet();
    }

    public  void addAresta(Aresta a){
        nos.add(a.getTabaOrigem());
        nos.add(a.getTabaDestino());
        aresta.add(a);
    }
    public  boolean contem(No n){
        return nos.contains(n);
    }
    public boolean contemAresta(No o, No d){
        for (Aresta a: aresta) {
            if (a.getTabaOrigem()==o && a.getTabaDestino()==d){
                return true;
            }
            if (a.getTabaDestino() == o && a.getTabaOrigem() ==d){
                return true;
            }
        }
        return false;
    }
    public void printaAGM(){
        for (Aresta a: aresta) {
            System.out.print(a.getTabaOrigem().getNumero());
            System.out.println(" "+a.getTabaDestino().getNumero());
        }
    }
}
