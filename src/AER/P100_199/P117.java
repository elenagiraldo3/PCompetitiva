package AER.P100_199;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P117 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        String frase, nombre;
        while (n > 0) {
            frase = bf.readLine();
            nombre = frase.substring(4);
            System.out.println("Hola, "+nombre+".");
            n--;
        }
    }
}
