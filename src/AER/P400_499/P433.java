package AER.P400_499;

import java.util.Scanner;

public class P433 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int resultado, fila;
        while (n!=0) {
            resultado = 1;
            fila = 1;
            while (resultado < n) {
                fila++;
                resultado += fila;
            }
            System.out.println(fila);
            n = sc.nextInt();
        }
    }

}
