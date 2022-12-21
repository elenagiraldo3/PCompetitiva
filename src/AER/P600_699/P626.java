package AER.P600_699;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P626 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        while (n > 0) {
            String[] fecha = bf.readLine().split("/");
            int ano_actual = Integer.parseInt(fecha[2]);
            int ano;
            if (ano_actual % 4 == 0) {
                // Año bisiesto
                int mes = Integer.parseInt(fecha[1]);
                if (mes <= 2) {
                    // Antes del cumpleaños
                    int dia = Integer.parseInt(fecha[0]);
                    if (dia == 29 && mes == 2) {
                        ano = ano_actual+4;
                    } else {
                        ano = ano_actual;
                    }
                } else {
                    ano = ano_actual + 4;
                }
            } else {
                ano = ano_actual + 4 - (ano_actual%4);
            }

            String sol = String.format("%04d", ano);
            System.out.println("29/02/"+sol);
            n--;
        }
    }
}
