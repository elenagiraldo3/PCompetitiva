package AER.P200_299;

import java.util.Arrays;
import java.util.Scanner;

public class P220 {
    static int[][] calculadora = {{2,3,4,7},{1,3,5,8},{1,2,6,9},{1,5,6,7},{2,4,6,8},{3,4,5,9},{1,4,8,9},{2,5,7,9},{3,6,7,8}};
    static int[][] memo = new int[31][9];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int[] ints : memo) {
            Arrays.fill(ints, -1);
        }
        while (n > 0) {
            int valor = sc.nextInt();
            int num = sc.nextInt();
            if (dp(valor,num) == 1) {
                System.out.println("GANA");
            } else {
                System.out.println("PIERDE");
            }
            n--;
        }
    }

    private static int dp(int valor, int num) {
        if (valor >= 31) {
            return 1;
        }
        if (memo[valor-1][num-1] != -1) {
            return memo[valor-1][num-1];
        }
        boolean sol = false;
        for (int i = 0; i < 4; i++) {
            if (dp(valor+calculadora[num-1][i],calculadora[num-1][i]) == 0) {
                memo[valor-1][num-1] = 1;
                sol = true;
                break;
            }
        }
        if (!sol) {
            memo[valor-1][num-1] = 0;
        }
        return memo[valor-1][num-1];
    }
}
