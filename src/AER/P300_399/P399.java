package AER.P300_399;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class P399 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String[] linea = bf.readLine().split(" ");
        while (!linea[0].equals("0")) {
            int[] bolas = new int[linea.length-1];
            for (int i = 0; i < linea.length-1; i++) {
                bolas[i] = Integer.parseInt(linea[i]);
            }
            if (bolas.length % 2 == 0) {
                System.out.println("NO");
            } else {
                Arrays.sort(bolas);
                int[] solucion = new int[bolas.length];
                boolean cumple = true;
                for (int i = 0; i < bolas.length - 1; i = i + 2) {
                    if (bolas[i] == bolas[i + 1]) {
                        solucion[i / 2] = bolas[i];
                        solucion[solucion.length - (i / 2) - 1] = bolas[i];
                    } else {
                        cumple = false;
                        break;
                    }
                }
                if (!cumple) {
                    System.out.println("NO");
                } else {
                    solucion[solucion.length / 2] = bolas[bolas.length - 1];
                    for (int i = 0; i < solucion.length - 1; i++) {
                        System.out.print(solucion[i] + " ");
                    }
                    System.out.println(solucion[solucion.length - 1]);
                }
            }
            linea = bf.readLine().split(" ");
        }
    }
}
