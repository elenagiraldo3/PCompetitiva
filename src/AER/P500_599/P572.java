package AER.P500_599;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P572 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        while (n > 0) {
            String[] linea = bf.readLine().split(" ");
            boolean esCero = false;
            boolean esNueve = false;
            for (String s : linea) {
                double nota = Double.parseDouble(s);
                if (nota == 0.0)
                    esCero = true;
                if (nota >= 9.0)
                    esNueve = true;
                if (esCero && esNueve)
                    break;
            }
            if (esCero && !esNueve)
                System.out.println("SUSPENSO DIRECTO");
            else
                System.out.println("MEDIA");
            n--;
        }
    }
}
