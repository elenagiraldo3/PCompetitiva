package SPOJ;

import java.util.Scanner;

public class TEST {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean b = true;
        while (sc.hasNextInt()) {
            if (b) {
                if (n != 42) {
                    System.out.println(n);
                } else {
                    b = false;
                }
            }
            n = sc.nextInt();
        }
    }
}
