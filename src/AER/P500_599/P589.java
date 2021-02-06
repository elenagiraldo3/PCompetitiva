package AER.P500_599;

import java.util.Scanner;

public class P589 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        while (n != 0) {
            long max = 0;
            long suma = 0;
            long actual;
            for (int i = 0; i < n; i++) {
                actual = sc.nextLong();
                if (actual > max) {
                    max = actual;
                }
                suma += actual;
            }
            System.out.println((n*max)-suma);
            n = sc.nextLong();
        }
    }
}
