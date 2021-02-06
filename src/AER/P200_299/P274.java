package AER.P200_299;

import java.util.Scanner;

public class P274 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n > 0) {
            int a = sc.nextInt();
            int s = sc.nextInt();
            int i = sc.nextInt();
            if (i != 1)
                System.out.println((a-(s+1-i))/s);
            else
                System.out.println(a/s);
            n--;
        }
    }
}
