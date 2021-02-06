package SWERC;

import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int p = sc.nextInt();
            int l = sc.nextInt();
            int[] array = new int[l];
            for (int i = 0; i < p; i++) {
                int m = sc.nextInt();
                int c = sc.nextInt();
                array[c] = m;
            }
            int n = sc.nextInt();
            int cont = sc.nextInt()-1;
            long sol = array[cont];
            for (int i = 1; i < n; i++) {
                cont += sc.nextInt();
                if (cont < l)
                    sol += array[cont];
            }
            System.out.println(sol);
            t--;
        }
    }
}
