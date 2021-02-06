package AER.P300_399;

import java.util.Scanner;

public class P375 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()) {
            String linea = sc.nextLine();
            String solucion = "";
            int numero = Integer.parseInt(linea.substring(0,2));
            String letra = "";
            if (linea.length() == 3) {
                letra = linea.substring(2);
                switch (letra) {
                    case "L":
                        letra = "R";
                        break;
                    case "R":
                        letra = "L";
                        break;
                    default:
                        letra = "C";
                        break;
                }
            }
            if (numero < 18) {
                numero = 18 + numero;
            } else if (numero == 18){
                numero = 36;
            } else {
                numero = numero - 18;
                if (numero < 10) {
                    solucion = "0";
                }
            }
            solucion = solucion+ numero + letra;

            System.out.println(solucion);
        }
    }
}
