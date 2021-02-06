package AER.P400_499;

import java.util.Scanner;

public class P434 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int palomas,cajas;
        while (n > 0) {
            palomas = sc.nextInt();
            cajas = sc.nextInt();
            if (palomas > cajas) {
                System.out.println("PRINCIPIO");
            } else {
                System.out.println("ROMANCE");
            }
            n--;
        }
    }
}
