package AER.P300_399;

import java.util.Scanner;

public class P368 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int c = sc.nextInt();
        int d;
        while (h != 0 && c!=0) {
            d = h % c;
            if (d == 0) {
                System.out.println((h/c)*10);
            } else {
                System.out.println(((h/c)+1)*10);
            }
            h = sc.nextInt();
            c = sc.nextInt();
        }
    }
}
