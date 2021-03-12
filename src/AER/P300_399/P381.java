package AER.P300_399;

import java.math.BigInteger;
import java.util.Scanner;

public class P381 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        BigInteger primero, segundo;
        while(n != 0) {
            primero = sc.nextBigInteger();
            for (int i = 0; i < n-1; i++) {
                segundo = sc.nextBigInteger();
                primero = (primero.multiply(segundo)).divide(primero.gcd(segundo));
            }
            System.out.println(primero);
            n = sc.nextInt();
        }
    }
}
