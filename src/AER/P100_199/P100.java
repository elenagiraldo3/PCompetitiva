package AER.P100_199;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class P100 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(bf.readLine());
        while(t != 0) {
            String numero = bf.readLine();
            if (numero.length() == 1) {
                numero += "000";
            } else if (numero.length() == 2) {
                numero += "00";
            } else if (numero.length() == 3) {
                numero += "0";
            }
            if (numero.equals("0000") || numero.equals("1111") || numero.equals("2222") || numero.equals("3333")
                    || numero.equals("4444") || numero.equals("5555") || numero.equals("6666") || numero.equals("7777")
                    || numero.equals("8888") || numero.equals("9999")) {
                System.out.println(8);
            } else {
                int cont = 0;
                while(!numero.equals("6174")) {
                    if (numero.length() == 1) {
                        numero += "000";
                    } else if (numero.length() == 2) {
                        numero += "00";
                    } else if (numero.length() == 3) {
                        numero += "0";
                    }
                    char[] toChar = numero.toCharArray();
                    Arrays.sort(toChar);
                    String menor = "";
                    String mayor = "";
                    for (int i = 0; i < 4; i++) {
                        mayor += toChar[3 - i];
                        menor += toChar[i];
                    }
                    int resta = Integer.parseInt(mayor) - Integer.parseInt(menor);
                    numero = String.valueOf(resta);
                    cont++;
                }
                System.out.println(cont);
            }

            t--;
        }
    }
}
