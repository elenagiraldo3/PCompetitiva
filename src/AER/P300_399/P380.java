package AER.P300_399;

import java.util.Scanner;

public class P380 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int resultado;
        while (n != 0) {
            resultado = 0;
            while (n > 0) {
                resultado += sc.nextInt();
                n--;
            }
            System.out.println(resultado);
            n = sc.nextInt();
        }
    }
}
