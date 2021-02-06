package AER.P200_299;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P221 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        while (n > 0) {
            int casos = Integer.parseInt(bf.readLine());
            int pares = 0;
            boolean cumplen = true;
            boolean impares = false;
            String[] linea = bf.readLine().split(" ");
            for (int i = 0; i < casos; i++) {
                if (Integer.parseInt(linea[i]) % 2 == 0) {
                    if (!impares)
                        pares++;
                    else {
                        cumplen = false;
                    }
                } else {
                    impares = true;
                }
            }
            if (cumplen)
                System.out.println("SI "+pares);
            else
                System.out.println("NO");
            n--;
        }
    }
}
