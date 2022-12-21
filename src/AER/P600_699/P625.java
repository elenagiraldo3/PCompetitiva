package AER.P600_699;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class P625 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n > 0) {
            int tiras = sc.nextInt();
            ArrayList<Integer> longitudes = new ArrayList<>();
            for (int i=0; i<tiras; i++) {
                longitudes.add(sc.nextInt());
            }
            Collections.sort(longitudes, Collections.reverseOrder());
            boolean se_puede = false;
            int i = 0;
            int maxima_longitud = 0, segunda_longitud = 0, tercera_longitud = 0;
            while (!se_puede && (tiras - i >= 3)) {
                maxima_longitud = longitudes.get(i);
                segunda_longitud = longitudes.get(i+1);
                tercera_longitud = longitudes.get(i+2);

                if (tercera_longitud+segunda_longitud > maxima_longitud) {
                    se_puede = true;
                }

                i++;
            }
            if (se_puede)
                System.out.println(maxima_longitud+segunda_longitud+tercera_longitud);
            else
                System.out.println("NO HAY NINGUNO");

            n--;
        }
    }
}
