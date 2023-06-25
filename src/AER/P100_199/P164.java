package AER.P100_199;

import java.util.Scanner;
public class P164 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ix = sc.nextInt();
        int iy = sc.nextInt();
        int dx = sc.nextInt();
        int dy = sc.nextInt();

        while(((dx-ix) >=0) && ((dy-iy) >= 0)) {
            System.out.println((dx-ix)*(dy-iy));
            ix = sc.nextInt();
            iy = sc.nextInt();
            dx = sc.nextInt();
            dy = sc.nextInt();
        }
    }
}
