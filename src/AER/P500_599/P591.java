package AER.P500_599;

import java.util.Arrays;
import java.util.Scanner;

public class P591 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt()) {
            int n = sc.nextInt();
            long matriz[][] = new long[n][n];
            long suma[];
            if (n % 2 == 0) {
                suma = new long[n/2];
            } else {
                suma = new long[(n/2)+1];
            }
            Arrays.fill(suma,0);
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    matriz[i][j] = sc.nextLong();
                }
            }
            for (int i = 0; i < suma.length; i++) {
                for (int j = 0; j < suma.length; j++) {

                }
            }
            for (int i = 0; i < suma.length-1; i++) {
                System.out.print(suma[i]+" ");
            }
            System.out.println(suma[suma.length-1]);
        }
    }
}
