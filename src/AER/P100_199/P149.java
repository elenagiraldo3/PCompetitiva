package AER.P100_199;

import java.util.Scanner;

public class P149 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt()) {
            int solucion = 0;
            int toros = sc.nextInt();
            for (int i = 0; i < toros; i++) {
                int toro = sc.nextInt();
                if (toro > solucion) {
                    solucion = toro;
                }
            }
            System.out.println(solucion);
        }
    }
}
