package SWERC.Year2020;

import java.util.HashMap;
import java.util.Scanner;

public class B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt()) {
            int n = sc.nextInt();
            int cont = 0;
            HashMap<String, Integer> map = new HashMap<>(n);
            String solution = "NONE";
            for (int i = 0; i < n; i++) {
                String aux = sc.next();
                if (map.containsKey(aux)) {
                    int times = map.get(aux) + 1;
                    if (times > cont) {
                        cont = times;
                        solution = aux;
                    } else if (times == cont) {
                        solution = "NONE";
                    }
                    map.put(aux,times);
                } else {
                    map.put(aux, 1);
                    if (cont < 1) {
                        cont = 1;
                        solution = aux;
                    } else if (cont == 1) {
                        solution = "NONE";
                    }
                }
            }
            if (n-cont < cont) {
                System.out.println(solution);
            } else {
                System.out.println("NONE");
            }
        }
    }
}
