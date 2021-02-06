package AER.P500_599;

import java.util.Scanner;

public class P583 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n > 0) {
            int p = sc.nextInt();
            int s = sc.nextInt();
            long media = (p+s)/2;
            System.out.println((long) ((p-media)*100)/media);
            n--;
        }
    }
}
