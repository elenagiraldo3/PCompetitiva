package AER.P500_599;

import java.util.Scanner;

public class P532 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n > 0) {
            System.out.println((sc.nextInt() - sc.nextInt())*-1);
            n--;
        }
    }
}
