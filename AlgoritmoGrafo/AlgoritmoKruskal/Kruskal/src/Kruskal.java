import java.util.ArrayList;
import java.util.HashSet;

class Kruskal {

    private HashSet<No> nos;
    private ArrayList<Aresta> arestas;
    private ArvoreGeradoraMinima agm;

    public Kruskal(HashSet  nos2, ArrayList<Aresta> arestas2){
        this.nos = nos2;
        this.arestas = arestas2;
        agm = new ArvoreGeradoraMinima();
    }

    public ArvoreGeradoraMinima criaAGM(int n){
        for (int i = 0; i < n; i++) {
            if (!formaCiclo(arestas.get(i))){
                agm.addAresta(arestas.get(i));
            }
        }
        return  agm;
    }
    public boolean formaCiclo(Aresta candidata){
        boolean r = false;
        ArrayList<No> avO = candidata.getTabaOrigem().getVizinhos();
        for (No n: avO) {
            if (agm.contem(n)){
                if(agm.contemAresta(n,candidata.getTabaDestino()) && agm.contemAresta(n,candidata.getTabaOrigem())){
                    r = true;
                    break;
                }
            }
        }
        ArrayList<No> avD = candidata.getTabaDestino().getVizinhos();
        for (No n: avD) {
            if (agm.contem(n)) {
                if(agm.contemAresta(n,candidata.getTabaDestino()) && agm.contemAresta(candidata.getTabaOrigem(),candidata.getTabaDestino())){
                    r = true;
                    break;
                }
            }
        }

        return r;
    }
}