package AER.P100_199;

import java.util.Scanner;

public class P192 {
    static int[] array = new int[20001];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        array[1] = 1;
        int n = sc.nextInt();
        while (n != 0) {
            int b = f(n);
            if (b == -1)
                System.out.println("NO");
            else
                System.out.println("SI");
            n = sc.nextInt();
        }
    }

    private static int f(int n) {
        if (n == 1)
            return 1;
        if (n < 1)
            return -1;
        if (array[n] != 0)
            return array[n];
        if (n % 3 == 0)
            array[n] = f(n/3) + f(n-5);
        else
            array[n] = f(n-5);
        if (array[n] < 0)
            array[n] = -1;
        else
            array[n] = 1;
        return array[n];
    }
}
