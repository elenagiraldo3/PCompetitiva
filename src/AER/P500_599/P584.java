package AER.P500_599;

import java.util.Scanner;

public class P584 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n > 0) {
            int p = sc.nextInt();
            int s = sc.nextInt();
            int t = sc.nextInt();
            int horas = s*t;
            int encendido = p/t;
            if ((encendido==s) && (horas==p)) {
                System.out.println("AMBAS");
            } else if ((horas >= p) && (encendido<s)) {
                System.out.println("HORAS");
            } else {
                System.out.println("ENCENDIDOS");
            }
            n--;
        }
    }
}
