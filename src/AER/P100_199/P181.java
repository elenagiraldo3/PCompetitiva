package AER.P100_199;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P181 {
    //DP
    static boolean[][] tablero;
    static int[][] memo;
    static int n;
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(bf.readLine());
        while (n != 0) {
            tablero = new boolean[n][n];
            memo = new int[n][n];
            for (int i = 0; i < n; i++) {
                String linea = bf.readLine();
                for (int j = 0; j < n; j++) {
                    memo[i][j] = -1;
                    tablero[n-i-1][j] = linea.charAt(j) == '.';
                }
            }
            System.out.println(f(0,0));
            n = Integer.parseInt(bf.readLine());
        }
    }

    private static int f(int i, int j) {
        if (i>=n || j>=n || !tablero[i][j])
            return 0;
        if (i==(n-1) && j==(n-1))
            return 1;
        if (memo[i][j] != -1)
            return memo[i][j];
        memo[i][j] = f(i+1,j) + f(i,j+1);
        return memo[i][j];
    }
}
