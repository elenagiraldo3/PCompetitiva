package AER.P100_199;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P132 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String linea = bf.readLine();
        int n = Integer.parseInt(bf.readLine());
        while (n != 0) {
            int[] memo = new int[linea.length()];
            int cont = 0;
            char c = linea.charAt(0);
            memo[0] = cont;
            for (int i = 1; i < linea.length(); i++) {
               if (linea.charAt(i) == c) {
                   memo[i] = cont;
               } else {
                   cont++;
                   memo[i] = cont;
                   c = linea.charAt(i);
               }
            }
            for (int i = 0; i < n; i++) {
                String[] aux = bf.readLine().split(" ");
                int min = Math.min(Integer.parseInt(aux[0]),Integer.parseInt(aux[1]));
                int max = Math.max(Integer.parseInt(aux[0]),Integer.parseInt(aux[1]));
                if (memo[min] == memo[max])
                    System.out.println("SI");
                else
                    System.out.println("NO");
            }
            System.out.println("");
            linea = bf.readLine();
            n = Integer.parseInt(bf.readLine());
        }
    }

}