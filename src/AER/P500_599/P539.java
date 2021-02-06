package AER.P500_599;

import java.util.Scanner;

public class P539 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt()) {
            int start = sc.nextInt();
            int actual = sc.nextInt();
            if ((actual-start+1)%10==0) {
                System.out.println("FELIZ DECADA NUEVA");
            } else {
                System.out.println("TOCA ESPERAR");
            }
        }
    }
}
