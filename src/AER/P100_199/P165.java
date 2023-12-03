package AER.P100_199;

import java.util.Scanner;

public class P165 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n >= 0) {
            while (n > 0) {
                if ((n % 2 == 1)) {
                    break;
                } else {
                    n /= 10;
                }
            }

            if (n == 0) {
                System.out.println("SI");
            } else {
                System.out.println("NO");
            }
            n = sc.nextInt();

        }
    }
}
