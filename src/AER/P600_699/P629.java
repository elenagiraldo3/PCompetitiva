package AER.P600_699;

import java.io.IOException;
import java.util.Scanner;

public class P629 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n != 0) {
            int[] linea = new int[n];
            for (int i=0; i<n; i++) {
                linea[i] = sc.nextInt();
            }
            int ruido = 0;
            int ruido_actual = 0;
            for (int i=(n-1); i>0; i--) {
                if ((linea[i]) > ruido_actual) {
                   ruido_actual = linea[i];
                }
                if (ruido_actual >= 1) {
                    ruido++;
                }
                if (ruido_actual > 0)
                    ruido_actual--;
            }
            System.out.println(ruido);

            n = sc.nextInt();
        }
    }
}
