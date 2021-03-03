package SWERC.Year2020;

import java.util.Scanner;

public class I {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n1 = sc.nextInt() + 1;
            int n2 = sc.nextInt() + 1;
            int n12 = sc.nextInt() + 1;
            double n = n1*n2;
            n = n/n12;
            n = n - 1;
            System.out.println((int) n);
        }
    }
}
