package AER.P300_399;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class P319 {
    static boolean[] visitado = new boolean[10000];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextInt()) {
            int inicio = sc.nextInt();
            int fin = sc.nextInt();

            Arrays.fill(visitado, false);

            Queue<Integer> cola = new LinkedList<>();
            cola.add(inicio);
            visitado[inicio] = true;
            int level = 0;
            cola.add(null);
            while(cola.size() > 1) {
                Integer aux = cola.remove();
                if (aux == null) {
                    level++;
                    cola.add(null);
                } else {
                    if (aux == fin) {
                        System.out.println(level);
                        break;
                    }

                    int vecino = (aux + 1) % 10000;
                    if (!visitado[vecino]) {
                        visitado[vecino] = true;
                        cola.add(vecino);
                    }
                    int vecino2 = (aux * 2) % 10000;
                    if (!visitado[vecino2]) {
                        visitado[vecino2] = true;
                        cola.add(vecino2);
                    }

                    int vecino3 = (aux / 3) % 10000;
                    if (!visitado[vecino3]) {
                        visitado[vecino3] = true;
                        cola.add(vecino3);
                    }

                }
            }
        }
    }
}
