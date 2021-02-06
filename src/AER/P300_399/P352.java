package AER.P300_399;

import java.util.*;

public class P352 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n > 0) {
            int nodos = sc.nextInt();
            int aristas = sc.nextInt();
            ArrayList<Integer>[] grafo = new ArrayList[nodos];
            for (int i = 0; i < nodos; i++) {
                grafo[i] = new ArrayList<>();
            }
            for (int i = 0; i < aristas; i++) {
                int n1 = sc.nextInt();
                int n2 = sc.nextInt();
                grafo[n1-1].add(n2-1);
                grafo[n2-1].add(n1-1);
            }
            conexo(grafo);
            n--;
        }
    }

    private static void conexo(ArrayList<Integer>[] grafo) {
        boolean[] visitado = new boolean[grafo.length];
        Queue<Integer> cola = new LinkedList<>();
        int max = 0;
        int actual = 0;
        for (int i = 0; i < grafo.length; i++) {
            if (!visitado[i]) {
                cola.add(i);
                actual = 1;
                visitado[i] = true;
                while (!cola.isEmpty()) {
                    int aux = cola.remove();
                    for (int j = 0; j < grafo[aux].size(); j++) {
                        if (!visitado[grafo[aux].get(j)]) {
                            cola.add(grafo[aux].get(j));
                            visitado[grafo[aux].get(j)] = true;
                            actual++;
                        }
                    }
                }
                if (actual > max) {
                    max = actual;
                }
            }
        }
        System.out.println(max);
    }
}
