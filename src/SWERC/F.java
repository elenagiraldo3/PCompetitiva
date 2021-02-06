package SWERC;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class F {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt()) {
            int n = sc.nextInt();
            int e = sc.nextInt();
            ArrayList<Integer>[] matriz = new ArrayList[n];
            for (int i = 0; i < n; i++) {
                matriz[i] = new ArrayList<>();
            }
            for (int i = 0; i < e; i++) {
                int n1 = sc.nextInt();
                int n2 = sc.nextInt();
                matriz[n1].add(n2);
                matriz[n2].add(n1);
            }
            conexo(matriz);
        }
    }

    private static void conexo(ArrayList<Integer>[] grafo) {
        boolean[] visitado = new boolean[grafo.length];
        Queue<Integer> cola = new LinkedList<>();
        int cont = 0;
        for (int i = 0; i < grafo.length; i++) {
            if (!visitado[i]) {
                cola.add(i);
                visitado[i] = true;
                while (!cola.isEmpty()) {
                    int aux = cola.remove();
                    for (int j = 0; j < grafo[aux].size(); j++) {
                        if (!visitado[grafo[aux].get(j)]) {
                            cola.add(grafo[aux].get(j));
                            visitado[grafo[aux].get(j)] = true;
                        }
                    }
                }
                cont++;
            }
        }
        System.out.println(cont-1);
    }
}
