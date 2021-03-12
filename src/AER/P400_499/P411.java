package AER.P400_499;

import java.util.Scanner;

public class P411 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long pesomax = sc.nextLong();
        long elefante, sumapesos;
        int solucion;
        while (pesomax != 0) {
            elefante = sc.nextLong();
            solucion = 0;
            sumapesos = 0;
            while (elefante != 0) {
                sumapesos += elefante;
                if (sumapesos <= pesomax) {
                    solucion++;
                }
                elefante = sc.nextLong();
            }

            System.out.println(solucion);

            pesomax = sc.nextLong();
        }
    }
}
