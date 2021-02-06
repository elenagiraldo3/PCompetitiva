package SWERC;

import java.util.Scanner;

public class B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n > 0) {
            int t = sc.nextInt();
            int max = (t*2)+1;
            StringBuilder sol = new StringBuilder();
            int espacios = t;
            int linea = 1;
            //arbol
            for (int i = 1; i <= max; i=i+2) {
                for (int j = 0; j < espacios; j++) {
                    sol.append(" ");
                }
                for (int j = 0; j < linea; j++) {
                    sol.append("*");
                }
                for (int j = 0; j < espacios; j++) {
                    sol.append(" ");
                }
                sol.append("\n");
                espacios--;
                linea = linea + 2;
            }
            //tronco
            espacios = (max-t)/2;
            for (int i = 0; i < 2; i++) {
                for (int j = 0; j < espacios; j++) {
                    sol.append(" ");
                }
                for (int j = 0; j < t; j++) {
                    sol.append("*");
                }
                for (int j = 0; j < espacios; j++) {
                    sol.append(" ");
                }
                sol.append("\n");
            }
            System.out.println(sol);
            n--;
        }
    }
}
