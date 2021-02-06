package AER.P300_399;

import java.util.Scanner;

public class P369 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n!=0) {
            while (n > 0) {
                System.out.print(1);
                n--;
            }
            System.out.println("");
            n = sc.nextInt();
        }
    }
}
