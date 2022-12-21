package AER.P600_699;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P623 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        while (n > 0) {
            String[] linea = bf.readLine().split(" ");
            int[] joker = new int[10];

            for (int i=0; i<7; i++) {
                int j = Integer.parseInt(String.valueOf(linea[0].charAt(i)));
                int b = Integer.parseInt(String.valueOf(linea[1].charAt(i)));
                joker[j]++;
                joker[b]--;
            }

            boolean gana = true;
            int i = 0;
            while (gana && (i < 10)) {
                if (joker[i] != 0) {
                    gana = false;
                } else {
                    i++;
                }
            }

            if (gana) {
                System.out.println("GANA");
            } else {
                System.out.println("PIERDE");
            }

            n--;
        }
    }
}
