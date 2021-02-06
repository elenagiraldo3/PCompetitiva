package AER.P500_599;

import java.util.*;

public class P565 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n != 0) {
            ArrayList<Integer> t = new ArrayList<>(n);
            HashMap<Integer, Integer> map = new HashMap<>(n);
            for (int i = 0; i < n; i++) {
                int uno = sc.nextInt();
                int dos = sc.nextInt();
                if (map.containsKey(uno)) {
                    if (map.get(uno) > dos)
                        map.put(uno,dos);
                } else {
                    t.add(uno);
                    map.put(uno,dos);
                }
            }
            Collections.sort(t, Collections.reverseOrder());
            int cont = 1;
            for (int aux : t) {
                if (cont >= map.get(aux)) {
                    System.out.println(aux);
                    break;
                } else {
                    cont++;
                }
            }

            n = sc.nextInt();
        }
    }
}
