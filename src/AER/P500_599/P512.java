package AER.P500_599;

import java.util.Scanner;

public class P512 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n > 0) {
            int conejo = sc.nextInt();
            int caballo = sc.nextInt();
            System.out.println((conejo*100)/(conejo+caballo));
            n--;
        }
    }
}
