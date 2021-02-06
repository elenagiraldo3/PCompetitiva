package AER.P300_399;

import java.util.Scanner;

public class P321 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int buses = sc.nextInt();
        while (buses > 0) {
            int superior = sc.nextInt();
            int inferior = sc.nextInt();
            int fila = superior + inferior + 1;
            int columna = superior + 1;
            int resultado = ((fila*(fila-1))/2) + columna;
            System.out.println(resultado);
            buses--;
        }
    }
}
