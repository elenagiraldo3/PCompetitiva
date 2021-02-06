package AER.P200_299;

import java.util.Arrays;
import java.util.Scanner;

public class P254 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n != 0) {
            int[] esquiadores = new int[n];
            int[] esquis = new int[n];
            for (int i = 0; i < n; i++) {
                esquiadores[i] = sc.nextInt();
            }
            for (int i = 0; i < n; i++) {
                esquis[i] = sc.nextInt();
            }
            Arrays.sort(esquiadores);
            Arrays.sort(esquis);
            int solucion = 0;
            for (int i = 0; i < n; i++) {
                solucion += Math.abs(esquiadores[i]-esquis[i]);
            }
            System.out.println(solucion);
            n = sc.nextInt();
        }
    }
}
