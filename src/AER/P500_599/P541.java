package AER.P500_599;

import java.util.Scanner;

public class P541 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long c = sc.nextLong();
        while (!(a==0 && b==0 && c==0)) {
            long d;
            if (a==0 && b==0) {
                d = c;
            } else {
                d = mcd(a,b);
                d = mcd(d,c);
            }
            long resultado = a/d + b/d + c/d;
            System.out.println(resultado);
            a = sc.nextLong();
            b = sc.nextLong();
            c = sc.nextLong();
        }
    }

    private static long mcd(long a, long b) {
        if(b==0)
            return a;
        else
            return mcd(b, a % b);
    }
}
