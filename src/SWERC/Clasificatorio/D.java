package SWERC.Clasificatorio;

import java.util.Scanner;

public class D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n > 0) {
            int yo = sc.nextInt();
            long suma1 = 0;
            for (int i = 0; i < yo; i++) {
                suma1 += sc.nextInt();
            }
            int otro = sc.nextInt();
            long suma2 = 0;
            for (int i = 0; i < otro; i++) {
                suma2 += sc.nextInt();
            }
            if (suma1 < suma2) {
                System.out.println("RETREAT");
            } else {
                System.out.println("ATTACK");
            }
            n--;
        }
    }
}
