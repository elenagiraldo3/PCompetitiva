package SPOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;

public class ABCPATH {
    public static class Posicion {
        int h;
        int w;
        char letra;

        public Posicion(int h, int w, char letra) {
            this.h = h;
            this.w = w;
            this.letra = letra;
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int h, w, c;
        String[] linea = bf.readLine().split(" ");
        h = Integer.parseInt(linea[0]);
        w = Integer.parseInt(linea[1]);
        c = 0;
        while (h > 0 && w > 0) {
            c++;
            char[][] matriz = new char[h][w];
            boolean[][] visitados = new boolean[h][w];
            int cont = 0;
            ArrayDeque<Posicion> cola = new ArrayDeque<>();
            for (int i = 0; i < h; i++) {
                linea = bf.readLine().split("");
                for (int j = 0; j < w; j++) {
                    visitados[i][j] = false;
                    matriz[i][j] = linea[j].charAt(0);
                    if (linea[j].charAt(0) == 'A') {
                        cont = 1;
                        cola.add(new Posicion(i,j,'A'));
                        visitados[i][j] = true;
                    }
                }
            }
            char letraAct = 'A';
            while (!cola.isEmpty()) {
                Posicion aux = cola.poll();
                if (aux.letra == letraAct+1) {
                    cont++;
                    letraAct = aux.letra;
                }
                // Diagonal arriba izquierda
                if (aux.h-1>=0 && aux.w-1>=0) {
                    if (matriz[aux.h-1][aux.w-1] == aux.letra+1 && !visitados[aux.h-1][aux.w-1]) {
                        cola.add(new Posicion(aux.h-1, aux.w-1, (char) (aux.letra+1)));
                        visitados[aux.h-1][aux.w-1] = true;
                    }
                }
                // Arriba
                if (aux.h-1>=0) {
                    if (matriz[aux.h-1][aux.w] == aux.letra+1 && !visitados[aux.h-1][aux.w]) {
                        cola.add(new Posicion(aux.h-1, aux.w, (char) (aux.letra+1)));
                        visitados[aux.h-1][aux.w] = true;
                    }
                }
                // Diagonal arriba derecha
                if (aux.h-1>=0 && aux.w+1<w) {
                    if (matriz[aux.h-1][aux.w+1] == aux.letra+1 && !visitados[aux.h-1][aux.w+1]) {
                        cola.add(new Posicion(aux.h-1, aux.w+1, (char) (aux.letra+1)));
                        visitados[aux.h-1][aux.w+1] = true;
                    }
                }
                // Izquierda
                if (aux.w-1>=0) {
                    if (matriz[aux.h][aux.w-1] == aux.letra+1 && !visitados[aux.h][aux.w-1]) {
                        cola.add(new Posicion(aux.h, aux.w-1, (char) (aux.letra+1)));
                        visitados[aux.h][aux.w-1] = true;
                    }
                }
                // Derecha
                if (aux.w+1<w) {
                    if (matriz[aux.h][aux.w+1] == aux.letra+1 && !visitados[aux.h][aux.w+1]) {
                        cola.add(new Posicion(aux.h, aux.w+1, (char) (aux.letra+1)));
                        visitados[aux.h][aux.w+1] = true;
                    }
                }
                // Diagonal abajo izquierda
                if (aux.h+1<h && aux.w-1>=0) {
                    if (matriz[aux.h+1][aux.w-1] == aux.letra+1 && !visitados[aux.h+1][aux.w-1]) {
                        cola.add(new Posicion(aux.h+1, aux.w-1, (char) (aux.letra+1)));
                        visitados[aux.h+1][aux.w-1] = true;
                    }
                }
                // Abajo
                if (aux.h+1<h) {
                    if (matriz[aux.h+1][aux.w] == aux.letra+1 && !visitados[aux.h+1][aux.w]) {
                        cola.add(new Posicion(aux.h+1, aux.w, (char) (aux.letra+1)));
                        visitados[aux.h+1][aux.w] = true;
                    }
                }
                // Diagonal abajo derecha
                if (aux.h+1<h && aux.w+1<w) {
                    if (matriz[aux.h+1][aux.w+1] == aux.letra+1 && !visitados[aux.h+1][aux.w+1]) {
                        cola.add(new Posicion(aux.h+1, aux.w+1, (char) (aux.letra+1)));
                        visitados[aux.h+1][aux.w+1] = true;
                    }
                }
            }
            System.out.println("Case "+c+": "+cont);
            linea = bf.readLine().split(" ");
            h = Integer.parseInt(linea[0]);
            w = Integer.parseInt(linea[1]);
        }
    }
}
