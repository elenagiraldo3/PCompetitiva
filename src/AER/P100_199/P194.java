package AER.P100_199;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P194 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        while (n > 0) {
            String linea = bf.readLine();
            int cont = 0;
            for (int i = 0; i < linea.length(); i++) {
                if (linea.charAt(i) == '.') {
                    i += 2;
                    cont++;
                }
            }
            System.out.println(cont);
            n--;
        }
    }
}
