import java.util.HashSet;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

class Redotica {
    private static HashSet<No> nos = new HashSet<No>();
    private static ArrayList<Aresta> arestas = new ArrayList<Aresta>();
    static Scanner entrada = new Scanner(System.in);


    public static  void recebeEntrada(int n){
        int m = entrada.nextInt();
        for (int i = 0; i < m ; i++) {
            int x = entrada.nextInt();
            int y = entrada.nextInt();
            int z = entrada.nextInt();
            No r = verificaSeJaExiste(x);
            if (r == null) {
                r = new No(x);
                nos.add(r);
            }
            No r2 = verificaSeJaExiste(y);
            if (r2 == null) {
                r2 = new No(y);
                nos.add(r2);
            }
            r.vinculaVizinho(r2);
            r2.vinculaVizinho(r);
            Aresta a = new Aresta(r,r2,z);
            arestas.add(a);
        }
    }
    private  static No verificaSeJaExiste(int identificador){
        for (No aux : nos) {
            if (aux.getNumero() == identificador)
                return aux;
        }
        return null;
    }
    public static void main(String[] args) {
        int test = 1;
        while (entrada.hasNext()) {
            int n = entrada.nextInt();
            if(n == 0){
                break;
            }
            recebeEntrada(n);
            Collections.sort(arestas);
            Kruskal kruskal = new Kruskal(nos,arestas);
            ArvoreGeradoraMinima agm = kruskal.criaAGM(n);
            System.out.println("\nTeste "+test);
            agm.printaAGM();
            test++;
            nos.clear();
            arestas.clear();
        }
    }
}
