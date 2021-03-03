package AER.P500_599;

import java.util.Scanner;

public class P520 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cubiletes = sc.nextInt();
        int inicio = sc.nextInt();
        while (!(cubiletes == 0 && inicio == 0)) {
            int pos_actual = inicio;
            int c1 = sc.nextInt();
            int c2 = sc.nextInt();
            while (!(c1 == 0 && c2 == 0)) {
                if (c1 == pos_actual) {
                    pos_actual = c2;
                } else if (c2 == pos_actual) {
                    pos_actual = c1;
                }
                c1 = sc.nextInt();
                c2 = sc.nextInt();
            }
            System.out.println(pos_actual);
            cubiletes = sc.nextInt();
            inicio = sc.nextInt();
        }
    }
}
