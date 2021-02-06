package SPOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

class SBETS {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int c = Integer.parseInt(bf.readLine());
        while (c > 0) {
            Set<String> ganador = new HashSet<>();
            Set<String> perdedor = new HashSet<>();
            for (int i = 0; i < 16; i++) {
                String[] linea = bf.readLine().split(" ");
                String t1 = linea[0];
                String t2 = linea[1];
                int g1 = Integer.parseInt(linea[2]);
                int g2 = Integer.parseInt(linea[3]);
                if (g1 < g2) {
                    perdedor.add(t1);
                    ganador.remove(t1);
                    if (!perdedor.contains(t2)) {
                        ganador.add(t2);
                    }
                } else {
                    perdedor.add(t2);
                    ganador.remove(t2);
                    if (!perdedor.contains(t1)) {
                        ganador.add(t1);
                    }
                }
            }
            for (String s : ganador) {
                System.out.println(s);
            }
            c--;
        }
    }
}
