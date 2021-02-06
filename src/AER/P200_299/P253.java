package AER.P200_299;

import java.util.*;

public class P253 {
    static class Par{
        int posicion, level;

        public Par(int posicion, int level) {
            this.posicion = posicion;
            this.level = level;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dimension = sc.nextInt();
        int dado = sc.nextInt();
        int serpientes = sc.nextInt();
        int escaleras = sc.nextInt();
        while (!(dimension==0 && dado==0 && serpientes==0 && escaleras==0)) {
            HashMap<Integer, Integer> tablero = new HashMap<>();
            for (int i = 0; i < serpientes+escaleras; i++) {
                int s1 = sc.nextInt();
                int s2 = sc.nextInt();
                tablero.put(s1,s2);
            }
            System.out.println(bfs(dimension*dimension,dado,tablero));
            tablero.clear();
            dimension = sc.nextInt();
            dado = sc.nextInt();
            serpientes = sc.nextInt();
            escaleras = sc.nextInt();
        }
    }

    private static int bfs(int fin, int dado, HashMap<Integer, Integer> tablero) {
        boolean[] visitado = new boolean[fin];
        Queue<Par> cola = new LinkedList<>();
        cola.add(new Par(0,0));
        while(!cola.isEmpty()) {
            Par aux = cola.remove();
            if (aux.posicion == fin) {
                return aux.level;
            }
            for (int i = dado; i >= 1; i--) {
                if (aux.posicion+i >= fin) {
                    return aux.level+1;
                }

                if (!visitado[aux.posicion+i-1]) {
                    visitado[aux.level+i-1] = true;
                    if (tablero.containsKey(aux.posicion+i)) {
                        visitado[tablero.get(aux.posicion+i)-1] = true;
                        cola.add(new Par(tablero.get(aux.posicion+i), aux.level+1));
                    } else {
                        cola.add(new Par(aux.posicion+i,aux.level+1));
                    }
                }
            }
        }
        return -1;
    }
}
