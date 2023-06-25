package AER.P300_399;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P390 {
    static int magenta, cian, amarillo;

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        while (n != 0) {
            String[] aux = bf.readLine().split(" ");
            magenta = Integer.parseInt(aux[0]);
            amarillo = Integer.parseInt(aux[1]);
            cian = Integer.parseInt(aux[2]);
            String colores = aux[3];
            for (int i = 0; i < colores.length(); i++) {
                pintar(colores.charAt(i));
                if (magenta < 0 || amarillo < 0 || cian < 0) {
                    break;
                }
            }
            if (magenta < 0 || amarillo < 0 || cian < 0) {
                System.out.println("NO");
            } else {
                System.out.println("SI "+magenta+" "+amarillo+" "+cian);
            }
            n--;
        }
    }

    private static void pintar(char color) {
        switch (color) {
            case 'M':
                magenta--;
                break;
            case 'A':
                amarillo--;
                break;
            case 'C':
                cian--;
                break;
            case 'R':
                magenta--;
                amarillo--;
                break;
            case 'N':
                magenta--;
                amarillo--;
                cian--;
                break;
            case 'V':
                amarillo--;
                cian--;
                break;
            case 'L':
                magenta--;
                cian--;
                break;
            default:
                break;
        }
    }
}
