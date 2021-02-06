package AER.P200_299;

import java.util.*;

public class P288 {
    static int[] size;
    static int[] raiz;
    static int maxSize;

    private static void unir(int a, int b) {
        int raizA = busca(a);
        int raizB = busca(b);
        if (raizA != raizB) {
           int suma = size[raizA]+size[raizB];
           maxSize = Math.max(maxSize,suma);
           if (size[raizA] >= size[raizB]) {
               raiz[raizB] = raizA;
               size[raizA] = suma;
           } else {
               raiz[raizA] = raizB;
               size[raizB] = suma;
           }

        }
    }

    private static int busca(int n) {
        if (raiz[n] == n) {
            return n;
        }
        raiz[n] = busca(raiz[n]);
        return raiz[n];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int fila = sc.nextInt();
            int columna = sc.nextInt();
            StringBuilder solucion;

            //El tamaño de cada componente conexa al principio es 1 y es su propia raiz
            size = new int[fila*columna+1];
            raiz = new int[fila*columna+1];
            for (int i = 0; i < fila; i++) {
                for (int j = 0; j < columna; j++) {
                    size[i*fila+j] = 1;
                    raiz[i*fila+j] = i*fila+j;
                }
            }

            //Construimos matriz
            boolean[][] matriz = new boolean[fila+2][columna+2];
            sc.nextLine();
            for (int i = 1; i <= fila; i++) {
                String linea = sc.nextLine();
                for (int j = 1; j <= linea.length(); j++) {
                    if (linea.charAt(j-1) == '#') matriz[i][j]=true;
                }
            }

            //Vemos las componentes conexas
            maxSize = 1;
            for (int i = 1; i <= fila; i++) {
                for (int j = 1; j <= columna ; j++) {
                    if (matriz[i][j]) {
                        if (matriz[i-1][j]) unir((i-1)*fila+j,(i-2)*fila+j);
                        if (matriz[i+1][j]) unir((i-1)*fila+j,i*fila+j);
                        if (matriz[i][j-1]) unir((i-1)*fila+j,(i-1)*fila+(j-1));
                        if (matriz[i][j+1]) unir((i-1)*fila+j,(i-1)*fila+(j+1));
                        if (matriz[i-1][j-1]) unir((i-1)*fila+j,(i-2)*fila+(j-1));
                        if (matriz[i-1][j+1]) unir((i-1)*fila+j,(i-2)*fila+(j+1));
                        if (matriz[i+1][j-1]) unir((i-1)*fila+j,i*fila+(j-1));
                        if (matriz[i+1][j+1]) unir((i-1)*fila+j,i*fila+(j+1));
                    }
                }
            }
            solucion = new StringBuilder();
            solucion.insert(0, maxSize);
            //Siguientes pasos
            int sig = sc.nextInt();
            for (int i = 0; i < sig; i++) {
                int x = sc.nextInt();
                int y = sc.nextInt();
                matriz[x][y] = true;
                if (matriz[x-1][y]) unir((x-1)*fila+y,(x-2)*fila+y);
                if (matriz[x+1][y]) unir((x-1)*fila+y,x*fila+y);
                if (matriz[x][y-1]) unir((x-1)*fila+y,(x-1)*fila+(y-1));
                if (matriz[x][y+1]) unir((x-1)*fila+y,(x-1)*fila+(y+1));
                if (matriz[x-1][y-1]) unir((x-1)*fila+y,(x-2)*fila+(y-1));
                if (matriz[x-1][y+1]) unir((x-1)*fila+y,(x-2)*fila+(y+1));
                if (matriz[x+1][y-1]) unir((x-1)*fila+y,x*fila+(y-1));
                if (matriz[x+1][y+1]) unir((x-1)*fila+y,x*fila+(y+1));
                solucion.append(" ").append(maxSize);
            }
            System.out.println(solucion);
        }
    }




}
