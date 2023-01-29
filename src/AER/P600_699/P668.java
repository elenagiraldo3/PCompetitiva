package AER.P600_699;

import java.util.Scanner;

public class P668 {
    private static long restanacci(long a, long b, long n) {
        if (n == 0) {
            return a;
        }
        if (n == 1) {
            return b;
        }
        return restanacci(b, b-a, n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long n = sc.nextLong();
        while (!(a==0 && b==0 && n==0)) {
            n = n % 6;
            System.out.println(restanacci(a, b, n));
            a = sc.nextLong();
            b = sc.nextLong();
            n = sc.nextLong();
        }
    }

}
