package AER.P600_699;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P622 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        while (n != 0) {
            String[] linea = bf.readLine().split(" ");
            int nota = 0;
            for (int i = 0; i < n; i++) {
                nota = nota + Integer.parseInt(linea[i]);
            }
            int nota_prometida = Integer.parseInt(bf.readLine());
            int ultima_nota = nota_prometida * (n + 1) - nota;
            if (0 <= ultima_nota && ultima_nota <= 10) {
                System.out.println(ultima_nota);
            } else {
                System.out.println("IMPOSIBLE");
            }

            n = Integer.parseInt(bf.readLine());
        }
    }
}

