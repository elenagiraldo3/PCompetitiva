package AER.P200_299;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class P214 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        while (n != 0) {
            HashMap<String, Integer> reyes = new HashMap<>();
            String[] nombres = bf.readLine().split(" ");
            int cont;
            for (int i = 0; i < n; i++) {
                cont = 1;
                if (reyes.containsKey(nombres[i])) {
                    cont += reyes.get(nombres[i]);
                }
                reyes.put(nombres[i], cont);
            }
            int nsucesores = Integer.parseInt(bf.readLine());
            String[] sucesores = bf.readLine().split(" ");
            for (int i = 0; i < nsucesores; i++) {
                cont = 1;
                if (reyes.containsKey(sucesores[i])) {
                    cont += reyes.get(sucesores[i]);
                }
                System.out.println(cont);
                reyes.put(sucesores[i], cont);
            }
            System.out.println("");
            n = Integer.parseInt(bf.readLine());
        }
    }
}
