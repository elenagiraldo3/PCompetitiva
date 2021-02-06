package AER.P300_399;

import java.util.Scanner;

public class P397 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int numero;
        while (n>0) {
            numero = sc.nextInt();
            if (numero % 3 == 1) {
                System.out.println("NO");
            } else {
                System.out.println("SI");
            }
            n--;
        }
    }
}
