package AER.P500_599;

import java.util.Scanner;

public class P515 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n != 0) {
            if (n == 1) {
                System.out.println(1);
            } else if (n % 2 == 0) {
                System.out.println(n);
            } else {
                System.out.println(n-1);
            }
            n = sc.nextInt();
        }
    }
}
