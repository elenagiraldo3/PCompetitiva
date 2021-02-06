package AER.P300_399;

import java.util.Scanner;

public class P362 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int dia,mes;
        while (n > 0) {
            dia = sc.nextInt();
            mes = sc.nextInt();
            if ((dia == 25) && (mes == 12)) {
                System.out.println("SI");
            } else {
                System.out.println("NO");
            }
            n--;
        }
    }
}
