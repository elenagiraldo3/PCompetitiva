package AER.P400_499;

import java.util.Scanner;

public class P407 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int c,p,t,diferencia;
        c = sc.nextInt();
        p = sc.nextInt();
        t = sc.nextInt();
        while (c!=0 && p!=0 && t!=0) {
            diferencia = p+t;

            if (diferencia < c) {
                System.out.println(diferencia);
            } else {
                System.out.println(c - (diferencia - c));
            }

            c = sc.nextInt();
            p = sc.nextInt();
            t = sc.nextInt();
        }
    }
}
