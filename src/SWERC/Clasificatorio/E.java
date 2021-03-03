package SWERC.Clasificatorio;

import java.util.*;

public class E {
    static ArrayList<Integer>[] grafo;
    static int[] memo;
    static class Par {
        int nodo;
        int peso;

        public Par(int nodo, int peso) {
            this.nodo = nodo;
            this.peso = peso;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt()) {
            int n = sc.nextInt();
            grafo = new ArrayList[n];
            memo = new int[n];
            Arrays.fill(memo,-1);
            ArrayList<Integer> posibles = new ArrayList<>();
            ArrayList<Integer> sol = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                grafo[i] = new ArrayList<>();
                int conexiones = sc.nextInt();
                if (conexiones > 1)
                    posibles.add(i);
                for (int j = 0; j < conexiones; j++) {
                    grafo[i].add(sc.nextInt());
                }
            }
            dijkstra(0,n-1);
            for (int i:posibles) {
                int corto = memo[grafo[i].get(0)];
                int actual;
                boolean cumple = true;
                for (int j=1; j<grafo[i].size(); j++) {
                    actual = memo[grafo[i].get(j)];
                    if (corto != actual) {
                        cumple = false;
                        break;
                    }
                }
                if (cumple)
                    sol.add(i);
            }
            Collections.sort(sol);
            for (int i = 0; i < sol.size()-1; i++) {
                System.out.print(sol.get(i)+" ");
            }
            System.out.println(sol.get(sol.size()-1));
        }
    }

    private static int dijkstra(int inicio, int fin) {
        if (inicio == fin)
            return 0;
        if (memo[inicio] != -1)
            return memo[inicio];
        memo[inicio] = Integer.MAX_VALUE;
        for (int a : grafo[inicio]) {
            memo[inicio] = Math.min(memo[inicio], dijkstra(a,fin)+1);
        }
        return memo[inicio];
    }
}
