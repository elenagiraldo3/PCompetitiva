package AER.P100_199;

import java.util.Scanner;

public class P101 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n != 0) {
            int[][] M = new int[n][n];
            boolean[] isEsoterico = new boolean[n*n];
            boolean esoterico = true;

            int cm = 0;
            // Get the magic square from input
            for (int i=0; i<n; i++) {
                for(int j=0; j<n; j++) {
                    M[j][i] = sc.nextInt();
                    if (esoterico && (M[j][i] <= n*n)) {
                        isEsoterico[M[j][i]-1] = true;
                    } else {
                        esoterico = false;
                    }

                    if (i == 0) {
                        cm += M[j][i];
                    }
                }
            }

            boolean diabolico = true;
            // Check columns and diagonals
            long sumCols = 0;
            long sumD1 = 0;
            long sumD2 = 0;
            for (int i=0; i<n; i++) {
                for(int j=0; j<n; j++) {
                    sumCols += M[i][j];
                    if (i==j) {
                        sumD1 += M[i][j];
                    }
                    if (i == n - 1 - j) {
                        sumD2 += M[i][j];
                    }
                }
                if (sumCols == cm) {
                    sumCols = 0;
                } else {
                    diabolico = false;
                    break;
                }
            }

            if (sumD1 != cm || sumD2 != cm) {
                diabolico = false;
            }

            // Check rows
            if (diabolico) {
                long sumRows = 0;
                for (int j = 0; j < n; j++) {
                    for (int i = 0; i < n; i++) {
                        sumRows += M[i][j];
                    }
                    if (sumRows == cm) {
                        sumRows = 0;
                    } else {
                        diabolico = false;
                        break;
                    }
                }
            }

            if (diabolico && esoterico) {
                // Check esoterico
                for (int i = 0; i < n * n; i++) {
                    if (!isEsoterico[i]) {
                        esoterico = false;
                        break;
                    }
                }

                int cm2 = (4 * cm) / n;
                // Esquinas
                if (M[0][0] + M[0][n - 1] + M[n - 1][0] + M[n - 1][n - 1] != cm2) {
                    esoterico = false;
                }

                int mitad = n / 2;
                if (n % 2 == 0) { // n par
                    // Centro
                    if (M[mitad][mitad] + M[mitad][mitad - 1] + M[mitad - 1][mitad] + M[mitad - 1][mitad - 1] != cm2) {
                        esoterico = false;
                    }

                    // Centros lados
                    if (M[0][mitad] + M[0][mitad - 1] + M[mitad][0] + M[mitad - 1][0] + M[mitad][n - 1] + M[mitad - 1][n - 1] + M[n - 1][mitad] + M[n - 1][mitad - 1] != 2 * cm2) {
                        esoterico = false;
                    }

                } else { // n impar
                    // Centro
                    if (M[mitad][mitad] * 4 != cm2) {
                        esoterico = false;
                    }

                    // Centros lados
                    if (M[0][mitad] + M[mitad][0] + M[n - 1][mitad] + M[mitad][n - 1] != cm2) {
                        esoterico = false;
                    }
                }

                if (esoterico) {
                    System.out.println("ESOTERICO");
                } else {
                    System.out.println("DIABOLICO");
                }

            } else if (diabolico) {
                System.out.println("DIABOLICO");
            } else {
                System.out.println("NO");
            }


            n = sc.nextInt();
        }
    }
}
