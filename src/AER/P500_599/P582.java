package AER.P500_599;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P582 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        while (n > 0) {
            String[] linea = bf.readLine().split(" ");
            if (linea.length > 12) {
                System.out.println("SALIDA NULA");
            }
            if (linea.length == 12) {
                System.out.println("CORRECTO");
            }
            if (linea.length < 12 && linea.length > 0) {
                if (linea[0].equals("")) {
                    System.out.println("MARISA NARANJO");
                } else {
                    System.out.println("TARDE");
                }
            }
            n--;
        }
    }
}
