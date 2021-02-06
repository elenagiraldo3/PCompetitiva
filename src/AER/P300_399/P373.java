package AER.P300_399;

import java.util.Scanner;

public class P373 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n > 0) {
            long m = sc.nextLong();
            long aux = m-2;
            System.out.println(8 + aux*12 + (aux*aux)*6);
            n--;
        }
    }
}
