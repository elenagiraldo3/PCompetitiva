package AER.P100_199;

import java.util.Scanner;
public class P155 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();

        while((x >=0) && (y >= 0)) {
            System.out.println((x*2)+(y*2));
            x = sc.nextInt();
            y = sc.nextInt();
        }
    }
}
