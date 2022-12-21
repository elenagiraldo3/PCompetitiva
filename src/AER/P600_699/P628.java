package AER.P600_699;

import java.util.Scanner;

public class P628 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLong()) {
            long sabor = sc.nextLong();
            long grosor = sc.nextLong();
            long best_sabor = sabor;
            long best_grosor = grosor;
            boolean mejor = true;
            while (sabor != 0 && grosor != 0) {
                if ((best_sabor <= sabor) && (best_grosor >= grosor)) {

                    best_sabor = sabor;
                    best_grosor = grosor;
                    mejor = true;

                } else {

                    if (best_sabor < sabor) {
                        best_sabor = sabor;
                        mejor = false;
                    }

                    if (best_grosor > grosor) {
                        best_grosor = grosor;
                        mejor = false;
                    }
                }

                sabor = sc.nextLong();
                grosor = sc.nextLong();
            }

            if (mejor) {
                System.out.println(best_sabor + " " + best_grosor);
            } else {
                System.out.println("NO HAY MEJOR");
            }
        }
    }
}
