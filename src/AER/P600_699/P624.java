package AER.P600_699;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class P624 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        while (n != 0) {
            String[] calcetines = bf.readLine().split(" ");
            int maximo = 0;
            int cuenta = 0;
            Set<Integer> mesa = new HashSet<>();
            for (int i=0; i<n; i++) {
                int calcetin = Integer.parseInt(calcetines[i]);
                if (mesa.contains(calcetin)) {
                    cuenta--;
                    mesa.remove(calcetin);
                } else {
                    mesa.add(calcetin);
                    cuenta++;
                    if (cuenta > maximo) {
                        maximo = cuenta;
                    }
                }
            }
            System.out.println(maximo);
            n = Integer.parseInt(bf.readLine());
        }
    }
}
