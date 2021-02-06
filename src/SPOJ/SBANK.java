package SPOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SBANK {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(bf.readLine());
        while (t > 0) {
            int n = Integer.parseInt(bf.readLine());
            Map<String,Integer> mapa = new HashMap<>();
            while (n > 0) {
                String linea = bf.readLine();
                int cont;
                if (mapa.containsKey(linea)) {
                    cont = mapa.get(linea) + 1;
                } else {
                    cont = 1;
                }
                mapa.put(linea,cont);
                n--;
            }
            String[] s = mapa.keySet().toArray(new String[0]);
            Arrays.sort(s);
            for (String sol: s) {
                System.out.println(sol+" "+mapa.get(sol));
            }
            bf.readLine();
            t--;
        }
    }
}
