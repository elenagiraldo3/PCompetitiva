package AER.P600_699;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P694 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        while (n > 0) {
            String[] frase = bf.readLine().split(" ");
            StringBuilder solucion = new StringBuilder();
            for (String palabra: frase) {
                if (Character.isUpperCase(palabra.charAt(0))) {
                    solucion.append(palabra.charAt(0));
                }
            }
            System.out.println(solucion);
            n--;
        }
    }
}
