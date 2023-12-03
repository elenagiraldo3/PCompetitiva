package AER.P100_199;

import java.util.Scanner;

public class P130 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int lado = sc.nextInt();
        while (lado > 0) {
            int x1 = sc.nextInt();
            int y1 = sc.nextInt();
            int x2 = sc.nextInt();
            int y2 = sc.nextInt();

            if (((x1 + y1) % 2) == ((x2 + y2) % 2)) {
                if ((x1 == x2) && (y1 == y2)) {
                    System.out.println(0);
                } else {
                    if (Math.abs(x1 - x2) == Math.abs(y1 - y2)) {
                        System.out.println(1);
                    } else {
                        System.out.println(2);
                    }
                }
            } else {
                System.out.println("IMPOSIBLE");
            }

            lado = sc.nextInt();
        }
    }
}
