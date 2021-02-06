package AER.P300_399;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P330 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        int primero, ultimo, nota;
        while (n != 0) {
            String[] linea = bf.readLine().split(" ");
            int[] octava = new int[n];
            for (int i = 0; i < n; i++) {
                octava[i] = Character.getNumericValue(linea[i].charAt(linea[i].length()-1));
                linea[i] = linea[i].substring(0,linea[i].length()-1);
            }
            primero = 83;
            ultimo = 0;
            int[] resultado = new int[84];
            for (int i = 0; i < n; i++) {
                switch (linea[i]) {
                    case "Dob": {
                        nota = -1;
                        break;
                    }
                    case "Do": {
                        nota = 0;
                        break;
                    }
                    case "Do#":
                    case "Reb": {
                        nota = 1;
                        break;
                    }
                    case "Re": {
                        nota = 2;
                        break;
                    }
                    case "Re#":
                    case "Mib": {
                        nota = 3;
                        break;
                    }
                    case "Mi":
                    case "Fab": {
                        nota = 4;
                        break;
                    }
                    case "Mi#":
                    case "Fa": {
                        nota = 5;
                        break;
                    }
                    case "Fa#":
                    case "Solb": {
                        nota = 6;
                        break;
                    }
                    case "Sol": {
                        nota = 7;
                        break;
                    }
                    case "Sol#":
                    case "Lab": {
                        nota = 8;
                        break;
                    }
                    case "La": {
                        nota = 9;
                        break;
                    }
                    case "La#":
                    case "Sib": {
                        nota = 10;
                        break;
                    }
                    case "Si": {
                        nota = 11;
                        break;
                    }
                    default:
                        nota = 12;
                }
                resultado[nota+12*(octava[i]-1)]++;
                if(primero > (nota+12*(octava[i]-1))) {
                    primero = nota + 12*(octava[i]-1);
                }
                if(ultimo < (nota+12*(octava[i]-1))) {
                    ultimo = nota+12*(octava[i]-1);
                }
            }
            for (int i = primero; i < ultimo; i++) {
                System.out.print(resultado[i] + " ");
            }
            System.out.println(resultado[ultimo]);
            n = Integer.parseInt(bf.readLine());
        }
    }
}
