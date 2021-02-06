package AER.P200_299;

import java.util.*;

public class P279 {
    static boolean[] visitado = new boolean[100];
    static int[] color = new int[100];

    static class Par{
        int vertice, suColor;

        public Par(int vertice, int suColor) {
            this.vertice = vertice;
            this.suColor = suColor;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt()) {
            int v = sc.nextInt();
            int a = sc.nextInt();
            Arrays.fill(visitado,false);
            Arrays.fill(color, 0);
            ArrayList<Integer>[] grafo = new ArrayList[v];
            for (int i = 0; i < v; i++) {
                grafo[i] = new ArrayList<>();
            }
            while (a > 0) {
                int a1 = sc.nextInt();
                int a2 = sc.nextInt();
                grafo[a1].add(a2);
                grafo[a2].add(a1);
                a--;
            }
            boolean sol = true;
            for (int i = 0; i < v && sol; i++) {
                if (!visitado[i]) {
                    sol = esBipartito(i, grafo);
                }
            }
            if (sol) {
                System.out.println("SI");
            } else {
                System.out.println("NO");
            }
        }
    }

    private static boolean esBipartito(int i, ArrayList<Integer>[] grafo) {
        Queue<Par> cola = new LinkedList<Par>();
        cola.add(new Par(i,1));
        visitado[i] = true;
        color[i] = 1;
        while (!cola.isEmpty()) {
            Par actual = cola.remove();
            for (int ady : grafo[actual.vertice]) {
                int vecino = actual.suColor == 1 ? 2 : 1;
                if (color[ady] == actual.suColor) {
                    return false;
                }
                if (!visitado[ady]) {
                    visitado[ady] = true;
                    color[ady] = vecino;
                    cola.add(new Par(ady,vecino));
                }
            }
        }
        return true;
    }
}