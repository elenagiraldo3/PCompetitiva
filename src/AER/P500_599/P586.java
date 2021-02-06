package AER.P500_599;

import java.util.Scanner;

public class P586 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n > 0) {
            int c = sc.nextInt();
            int num = c;
            int min = 1990;
            int max = 1930;
            while (c > 0) {
                int a = sc.nextInt();
                if (min > a) {
                    min = a;
                }
                if (max < a) {
                    max = a;
                }
                c--;
            }
            int solucion = max - min - (num-2) - 1;
            System.out.println(solucion);
            n--;
        }
    }
}
