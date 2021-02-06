package AER.P500_599;

import java.util.Scanner;

public class P564 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int casos = sc.nextInt();
        while (casos > 0) {
            int n = sc.nextInt();
            System.out.println(n/3);
            casos--;
        }
    }
}
