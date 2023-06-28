package AER.P600_699;

import java.util.Scanner;

public class P698 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int casos = sc.nextInt();
        while (casos > 0) {
            int n = sc.nextInt();

            long solucion = 0;
            int max = 0;

            for (int i=0; i<n*n; i++) {
                int actual = sc.nextInt();
                if (actual > max) {
                    solucion += max;
                    max = actual;
                } else {
                    solucion += actual;
                }
            }

            if (solucion == max) {
                System.out.println("SI");
            } else {
                System.out.println("NO");
            }

            casos--;
        }
    }
}
