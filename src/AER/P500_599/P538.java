package AER.P500_599;

import java.util.Scanner;

public class P538 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int abuelo = sc.nextInt();
        int iglesia = sc.nextInt();
        while (!(abuelo==0 && iglesia==0)) {
            if (abuelo-iglesia >= 0) {
                System.out.println("CUERDO");
            } else {
                System.out.println("SENIL");
            }
            abuelo = sc.nextInt();
            iglesia = sc.nextInt();
        }
    }
}
