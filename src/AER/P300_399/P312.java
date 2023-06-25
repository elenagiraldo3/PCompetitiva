package AER.P300_399;

import java.util.Scanner;
public class P312 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long solution = n;
        long people = n;
        while(n != 0) {
            while (n != 0) {
                solution = gcd(solution, n);
                n = sc.nextLong();
                people = people + n;
            }
            System.out.println(people/solution);
            n = sc.nextLong();
            solution = n;
            people = n;
        }
    }

    private static long gcd(long a, long b) {
        if ((a == 0) | (b == 0)) {
            return a+b;
        }

        if (a < b){
            return gcd(a, b%a);
        }

        return gcd(a%b, b);
    }
}
