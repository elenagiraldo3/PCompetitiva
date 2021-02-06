package AER.P500_599;

import java.util.Arrays;
import java.util.Scanner;

public class P542 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n > 0) {
            int[] juguete = new int[3];
            int[] caja = new int[3];
            for (int i = 0; i < 3; i++) {
                juguete[i] = sc.nextInt();
            }
            for (int i = 0; i < 3; i++) {
                caja[i] = sc.nextInt();
            }
            Arrays.sort(juguete);
            Arrays.sort(caja);
            boolean sirve = true;
            for (int i = 0; i < 3; i++) {
                if (caja[i] <= juguete[i]) {
                    sirve = false;
                    break;
                }
            }
            if (sirve) {
                System.out.println("SIRVE");
            } else {
                System.out.println("NO SIRVE");
            }
            n--;
        }
    }
}
