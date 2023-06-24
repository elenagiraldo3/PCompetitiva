package AER.P600_699;

import java.util.Scanner;

public class P641 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        int n = sc.nextInt();

        while (!(i==0 && n==0)) {
            int[] casos = new int[n];

            long maximo = 0;
            long actual = 0;

            for (int j=0; j<n; j++) {
                casos[j] = sc.nextInt();
                actual += casos[j];
                if (j >= i) {
                    actual -= casos[j-i];

                }
                maximo = Math.max(maximo, actual);
            }

            System.out.println(maximo);

            i = sc.nextInt();
            n = sc.nextInt();
        }
    }

}
