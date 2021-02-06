package AER.P500_599;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P587 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        while(n > 0) {
            String linea = bf.readLine();
            int cont = 0;
            for (int i = 0; i < linea.length(); i=i+2) {
                if (linea.charAt(i) == linea.charAt(i+1)) {
                    cont = cont + 2;
                } else {
                    cont++;
                }
            }
            System.out.println(cont);
            n--;
        }
    }
}
