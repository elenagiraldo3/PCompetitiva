package AER.P300_399;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class P396 {
    public static class Solucion implements Comparable<Solucion>{
        int grupo;
        int partituras;
        int reducido;

        public Solucion(int grupo, int partituras, int reducido) {
            this.grupo = grupo;
            this.partituras = partituras;
            this.reducido = reducido;
        }

        @Override
        public int compareTo(Solucion o) {
            return Integer.compare(this.reducido,o.reducido);
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt()) {
            int p = sc.nextInt();
            int n = sc.nextInt();
            int num;
            p = p - n;
            PriorityQueue<Solucion> cola = new PriorityQueue<Solucion>(10, Collections.reverseOrder());
            for (int i = 0; i < n; i++) {
                num = sc.nextInt();
                cola.add(new Solucion(num,2,num));
            }
            for (int i = 0; i < p; i++) {
                Solucion aux = cola.remove();
                if (aux.grupo % aux.partituras == 0) {
                    aux.reducido = aux.grupo/aux.partituras;
                    aux.partituras++;
                } else {
                    aux.reducido = (aux.grupo/aux.partituras)+1;
                    aux.partituras++;
                }
                cola.add(aux);
            }
            System.out.println(cola.peek().reducido);
        }
    }
}
