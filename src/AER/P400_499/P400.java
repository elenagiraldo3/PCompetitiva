package AER.P400_499;

import java.util.Scanner;

public class P400 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String linea;
        boolean primero;
        int contador, resultado;
        while (sc.hasNextLine()) {
            linea = sc.nextLine();
            contador = 0;
            resultado = 0;
            primero = false;
            for (int i = 0; i < linea.length(); i++) {
                if (linea.charAt(i) == '.') {
                    if (i == 0) {
                        primero = true;
                    } else if (i == linea.length()-1) {
                        resultado = Math.max(resultado, contador);
                    }
                    contador++;
                } else {
                    if (primero) {
                       resultado = Math.max(resultado, contador-1);
                       primero = false;
                    } else {
                       if (contador % 2 == 0) {
                           resultado = Math.max(resultado, (contador/2)-1);
                       } else {
                           resultado = Math.max(resultado, contador/2);
                       }
                    }
                    contador = 0;
                }
            }
            System.out.println(resultado);
        }
    }
}
