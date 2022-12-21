package AER.P600_699;

import java.io.IOException;
import java.util.Scanner;

public class P621 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n > 0) {
            int numeracion = sc.nextInt();
            if (numeracion % 2 == 0)
                System.out.println(numeracion + 1);
            else
                System.out.println(numeracion - 1);
            n--;
        }
    }
}
