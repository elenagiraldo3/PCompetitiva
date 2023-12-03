package AER.P100_199;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P172 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String[] line = bf.readLine().split(" ");
        int n = Integer.parseInt(line[0]);
        while (n > 0) {
            String mesa = line[1];
            boolean derecha = false;
            boolean izquierda = false;
            boolean no_comen = false;
            int pos = 0;
            while (!no_comen && (pos < n)) {
                if (mesa.charAt(pos) == 'I') {
                    izquierda = true;
                    if (derecha) {
                        no_comen = true;
                    }
                }

                if (mesa.charAt(pos) == 'D') {
                    derecha = true;
                    if (izquierda) {
                        no_comen = true;
                    }
                }
                pos++;
            }

            if (no_comen) {
                System.out.println("ALGUNO NO COME");
            } else {
                System.out.println("TODOS COMEN");
            }

            line = bf.readLine().split(" ");
            n = Integer.parseInt(line[0]);
        }
    }
}
