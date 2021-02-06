package AER.P200_299;

import java.util.Scanner;

public class P255 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()) {
            String palabra = sc.nextLine();
            int ultimo = palabra.length()-1;
            int contador = 1;
            for (int i = 0; (i < palabra.length()) && (contador <= (ultimo-i)); i++) {
                while((ultimo-i) >= contador) {
                    if (palabra.charAt(i) == palabra.charAt(ultimo)) {
                        String aux = palabra;
                        contador = Math.max(contador, palindromo(aux,i,ultimo));
                    }
                    ultimo--;
                }
                ultimo = palabra.length()-1;
            }
            System.out.println(contador);
        }
    }

    private static int palindromo(String aux, int primero, int ultimo) {
        for (int i = primero; i <= (ultimo+primero)/2 ; i++) {
            if(aux.charAt(i) != aux.charAt(ultimo-(i-primero))) {
                return 0;
            }
        }
        return (ultimo-primero)+1;
    }
}