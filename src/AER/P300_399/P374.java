package AER.P300_399;

import java.util.Scanner;

public class P374 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n > 0) {
            long min = Long.MAX_VALUE;
            long max = 0;
            int contmin = 0;
            int contmax = 0;
            long aux = sc.nextLong();
            while (aux != 0) {
                if (aux == min) {
                    contmin++;
                }
                if (aux == max) {
                    contmax++;
                }
                if (aux < min) {
                    min = aux;
                    contmin = 1;
                }
                if (aux > max) {
                    max = aux;
                    contmax = 1;
                }


                aux = sc.nextLong();
            }
            System.out.println(min + " " + contmin + " " + max + " " + contmax);
            n--;
        }
    }
}
