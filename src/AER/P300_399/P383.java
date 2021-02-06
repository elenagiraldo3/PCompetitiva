package AER.P300_399;

import java.util.Scanner;

public class P383 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m, max, dif,n2;
        while (n > 0) {
            m = sc.nextInt();
            max = sc.nextInt();
            dif = -999999;
            for (int i = 1; i < m; i++) {
                n2 = sc.nextInt();
                dif = Math.max(dif, max-n2);
                max = Math.max(max, n2);
            }
            System.out.println(dif);
            n--;
        }
    }
}
