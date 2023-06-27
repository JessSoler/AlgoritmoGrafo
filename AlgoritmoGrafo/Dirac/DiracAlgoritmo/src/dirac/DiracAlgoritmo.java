package dirac;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class DiracAlgoritmo {
	
	 private int V; 
	    private List<List<Integer>> graph; 

	    public DiracAlgoritmo(int v) {
	        V = v;
	        graph = new ArrayList<>(v);
	        for (int i = 0; i < v; i++) {
	            graph.add(new ArrayList<>());
	        }
	    }
	
	    public void addEdge(int src, int dest) {
	        graph.get(src).add(dest);
	    }

	    public boolean hasCycle() {
	        boolean[] visited = new boolean[V];
	        boolean[] recursionStack = new boolean[V]; 

	        for (int i = 0; i < V; i++) {
	            if (hasCycleUtil(i, visited, recursionStack)) {
	                return true;
	            }
	        }

	        return false;
	    }

	    private boolean hasCycleUtil(int v, boolean[] visited, boolean[] recursionStack) {
	        if (recursionStack[v]) {
	            return true;
	        }

	        if (visited[v]) {
	            return false;
	        }

	        visited[v] = true;
	        recursionStack[v] = true;

	        List<Integer> neighbors = graph.get(v);
	        for (Integer neighbor : neighbors) {
	            if (hasCycleUtil(neighbor, visited, recursionStack)) {
	                return true;
	            }
	        }

	        recursionStack[v] = false;

	        return false;
	    }

	    public static void main(String[] args) {
	        DiracAlgoritmo dirac = new DiracAlgoritmo(4);
	        dirac.addEdge(0, 1);
	        dirac.addEdge(1, 2);
	        dirac.addEdge(2, 0);
	        dirac.addEdge(2, 3);

	        if (dirac.hasCycle()) {
	            System.out.println("O grafo contém ciclo é hamiltoniano.");
	        } else {
	            System.out.println("O grafo não contém ciclo não é hamiltoniano.");
	        }
	    }
}
