package AER.P100_199;

import java.util.Scanner;

public class P126 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int p = sc.nextInt();
        int n = sc.nextInt();
        while (p >= 0 && n >= 0) {
            if (n == 0 && p == 1) {
                System.out.println("YES");
            } else {
                if (n >= p) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            }
            p = sc.nextInt();
            n = sc.nextInt();
        }
    }
}
