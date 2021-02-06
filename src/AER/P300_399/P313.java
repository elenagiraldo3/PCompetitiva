package AER.P300_399;

import java.util.Scanner;

public class P313 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int s,c;
        while (n>0) {
            s = sc.nextInt();
            c = sc.nextInt();
            if ((s+c) < 0) {
                System.out.println("NO");
            } else {
                System.out.println("SI");
            }
            n--;
        }
    }
}
