package AER.P300_399;

import java.util.Scanner;

public class P371 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n != 0) {
            System.out.println(3*((n*(n+1))/2));
            n = sc.nextInt();
        }
    }

}
