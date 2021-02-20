package SPOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;

public class BITMAP {
    public static class Posicion {
        int i;
        int j;
        int dist;

        public Posicion(int i, int j, int dist) {
            this.i = i;
            this.j = j;
            this.dist = dist;
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(bf.readLine());
        for (int i = 0; i < t; i++) {
            String[] linea = bf.readLine().split(" ");
            int n = Integer.parseInt(linea[0]);
            int m = Integer.parseInt(linea[1]);
            int[][] matriz = new int[n][m];
            boolean[][] visitados = new boolean[n][m];
            ArrayDeque<Posicion> cola = new ArrayDeque<>();
            for (int j = 0; j < n; j++) {
                linea = bf.readLine().split("");
                for (int k = 0; k < m; k++) {
                    int pos = Integer.parseInt(linea[k]);
                    if (pos == 1) {
                        cola.add(new Posicion(j,k,0));
                        visitados[j][k] = true;
                        matriz[j][k] = 0;
                    } else {
                        visitados[j][k] = false;
                        matriz[j][k] = n+m-2;
                    }
                }
                
            }
            while (!cola.isEmpty()) {
                Posicion aux = cola.poll();
                // Arriba
                if (aux.i-1 >= 0) {
                    if(!visitados[aux.i-1][aux.j]) {
                        matriz[aux.i-1][aux.j] = aux.dist+1;
                        visitados[aux.i-1][aux.j] = true;
                        cola.add(new Posicion(aux.i-1, aux.j, aux.dist+1));
                    }
                }
                // Izquierda
                if (aux.j-1 >= 0) {
                    if(!visitados[aux.i][aux.j-1]) {
                        matriz[aux.i][aux.j-1] = aux.dist+1;
                        visitados[aux.i][aux.j-1] = true;
                        cola.add(new Posicion(aux.i, aux.j-1, aux.dist+1));
                    }
                }
                // Abajo
                if (aux.i+1 < n) {
                    if(!visitados[aux.i+1][aux.j]) {
                        matriz[aux.i+1][aux.j] = aux.dist+1;
                        visitados[aux.i+1][aux.j] = true;
                        cola.add(new Posicion(aux.i+1, aux.j, aux.dist+1));
                    }
                }
                // Derecha
                if (aux.j+1 < m) {
                    if(!visitados[aux.i][aux.j+1]) {
                        matriz[aux.i][aux.j+1] = aux.dist+1;
                        visitados[aux.i][aux.j+1] = true;
                        cola.add(new Posicion(aux.i, aux.j+1, aux.dist+1));
                    }
                }
            }
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < m-1; k++) {
                    System.out.print(matriz[j][k]+" ");
                }
                System.out.println(matriz[j][m-1]);
            }
            if (i < t-1)
                bf.readLine();
        }
    }
}
