package AER.P300_399;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P372 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        while (n > 0) {
            StringBuilder palabra = new StringBuilder(bf.readLine());
            boolean may = Character.isUpperCase(palabra.charAt(0));
            palabra.reverse();
            if (may) {
                char c = palabra.charAt(palabra.length()-1);
                c = Character.toLowerCase(c);
                palabra.deleteCharAt(palabra.length()-1);
                palabra.append(c);
                c = palabra.charAt(0);
                c = Character.toUpperCase(c);
                palabra.deleteCharAt(0);
                palabra.insert(0,c);
            }
            System.out.println(palabra);
            n--;
        }
    }
}
