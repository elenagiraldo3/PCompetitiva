package AER.P200_299;

import java.util.Arrays;
import java.util.Scanner;

public class P212 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int aristas = sc.nextInt();
        while (aristas!=0) {
            int vertices = sc.nextInt();
            boolean[] esPar = new boolean[vertices];
            Arrays.fill(esPar,true);
            while (aristas > 0) {
                int inicio = sc.nextInt();
                int fin = sc.nextInt();
                esPar[inicio-1] = !esPar[inicio - 1];
                esPar[fin-1] = !esPar[fin - 1];
                aristas--;
            }
            aristas = 0;
            int cont = 0;
            while (aristas < esPar.length && cont <= 2) {
                if (!esPar[aristas]) {
                     cont++;
                }
                aristas++;
            }
            if (cont <= 2) {
                System.out.println("SI");
            } else {
                System.out.println("NO");
            }
            aristas = sc.nextInt();
        }
    }
}
