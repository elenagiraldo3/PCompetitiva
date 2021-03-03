package AER.P500_599;

import java.util.Scanner;

public class P535 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int d = sc.nextInt();
        while (d != 0) {
            int[] alturas = new int[d];
            for (int i = 0; i < d; i++) {
                alturas[i] = sc.nextInt();
            }
            int limit = alturas[d-1];
            int sol = 0;
            for (int i = 0; i < d; i++) {
                sol += limit - alturas[i];
            }
            System.out.println(sol);
            d = sc.nextInt();
        }
    }
}
