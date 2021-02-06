package AER.P300_399;

import java.util.Scanner;

public class P376 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n != 0) {
            int primero = sc.nextInt();
            int segundo = sc.nextInt();
            int anterior, actual, siguiente;
            int cont = 0;
            anterior = primero;
            actual = segundo;
            for (int i = 2; i < n; i++) {
                siguiente = sc.nextInt();
                if (actual > anterior && actual > siguiente) {
                    cont++;
                }
                anterior = actual;
                actual = siguiente;
            }
            if (actual > anterior && actual > primero) {
                cont++;
            }
            if (primero>segundo && primero>actual) {
                cont++;
            }
            System.out.println(cont);
            n = sc.nextInt();
        }
    }
}
