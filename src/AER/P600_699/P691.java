package AER.P600_699;

import java.util.PriorityQueue;
import java.util.Scanner;

public class P691 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt()) {
            int filas = sc.nextInt();
            int asientos = sc.nextInt();
            int clientes = sc.nextInt();
            long recaudacion = 0;

            PriorityQueue<Integer> ocupados = new PriorityQueue<>(filas);
            for (int fila=0; fila<filas; fila++) {
                ocupados.offer(sc.nextInt());
            }

            for (int cliente=0; cliente<clientes; cliente++) {
                int mejor_fila = ocupados.poll();
                if (mejor_fila >= asientos) {
                    break;
                }
                recaudacion += (asientos - mejor_fila);
                mejor_fila += 1;
                ocupados.offer(mejor_fila);

            }

            System.out.println(recaudacion);
        }
    }
}
