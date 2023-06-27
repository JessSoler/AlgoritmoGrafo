package ore;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class AlgoritmoOre {
	 public static void main(String[] args) {
	        int[][] matrizAdjacencia = {
	            {0, 1, 1, 1},
	            {1, 0, 1, 1},
	            {1, 1, 0, 1},
	            {1, 1, 1, 0}
	        };
	        
	        boolean resultado = algoritmoOre(matrizAdjacencia);
	        System.out.println("O grafo é hamiltoniano: " + resultado);
	    }
	    
	    public static boolean algoritmoOre(int[][] matrizAdjacencia) {
	        int n = matrizAdjacencia.length;
	        
	        for (int u = 0; u < n; u++) {
	            for (int v = u + 1; v < n; v++) {
	                if (matrizAdjacencia[u][v] == 0 && !verificarAdjacencia(matrizAdjacencia, u, v)) {
	                    return false;
	                }
	            }
	        }
	        
	        return true;
	    }
	    
	    public static boolean verificarAdjacencia(int[][] matrizAdjacencia, int u, int v) {
	        int n = matrizAdjacencia.length;
	        
	        for (int i = 0; i < n; i++) {
	            if (i != u && i != v && matrizAdjacencia[u][i] == 1 && matrizAdjacencia[v][i] == 1) {
	                return true;
	            }
	        }
	        
	        return false;
	    }
}
