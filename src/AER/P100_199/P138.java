package AER.P100_199;

import java.util.Scanner;

public class P138 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int casos = sc.nextInt();
        while (casos > 0) {
            int n = sc.nextInt();
            int solucion = 0;
            while (n >= 5) {
                solucion += n / 5;
                n /= 5;
            }
            System.out.println(solucion);

            casos--;
        }

    }
}
