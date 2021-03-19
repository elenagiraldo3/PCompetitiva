package AER.P100_199;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class P197 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String linea = bf.readLine();
        while (linea != null) {
            StringBuilder impares = new StringBuilder();
            StringBuilder pares = new StringBuilder();
            for (int i = 0; i < linea.length(); i += 2) {
                pares.append(linea.charAt(i));
                if (i+1 < linea.length())
                    impares.append(linea.charAt(i+1));
            }
            impares.reverse();
            pares.append(impares);
            int min = 0;
            int max = min;
            for (int i = 0; i < pares.length(); i++) {
                if (pares.charAt(i) == 'a' || pares.charAt(i) == 'A' || pares.charAt(i) == 'e' || pares.charAt(i) == 'E'
                || pares.charAt(i) == 'i' || pares.charAt(i) == 'I' || pares.charAt(i) == 'o' || pares.charAt(i) == 'O'
                || pares.charAt(i) == 'u' || pares.charAt(i) == 'U') {
                    String aux = new StringBuilder(pares.subSequence(min, max)).reverse().toString();
                    pares.replace(min, max, aux);
                    min = max + 1;

                }
                max++;
            }
            if (min < max) {
                String aux = new StringBuilder(pares.subSequence(min, max)).reverse().toString();
                pares.replace(min, max, aux);
            }
            System.out.println(linea + " => " + pares);
            linea = bf.readLine();
        }
    }
}
