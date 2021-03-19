package AER.P400_499;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class P416 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        while (n != 0) {
            String[] linea = bf.readLine().split(" ");
            HashSet<String> cumpleanos = new HashSet<>(n);
            boolean repite = false;
            for (int i = 0; i < n; i++) {
                String aux = (String) linea[i].subSequence(0, linea[i].lastIndexOf('/'));
                if (cumpleanos.contains(aux)) {
                    repite = true;
                    break;
                } else {
                    cumpleanos.add(aux);
                }
            }
            if (repite) {
                System.out.println("SI");
            } else {
                System.out.println("NO");
            }

            n = Integer.parseInt(bf.readLine());
        }
    }
}
