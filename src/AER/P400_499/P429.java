package AER.P400_499;

import java.util.*;

public class P429 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        while (h != 0) {
            boolean cabe = true;
            ArrayList<Integer> hangares = new ArrayList<>(h);
            for (int i = 0; i < h; i++) {
                hangares.add(sc.nextInt());
            }
            int n = sc.nextInt();
            for (int i = 0; i < n; i++) {
                Collections.sort(hangares, Collections.reverseOrder());
                int nave = sc.nextInt();
                if (nave > hangares.get(0)) {
                    cabe = false;
                } else {
                    int aux = hangares.remove(0);
                    hangares.add(0, aux - nave);
                }
            }
            if (cabe) {
                System.out.println("SI");
            } else {
                System.out.println("NO");
            }
            h = sc.nextInt();
        }
    }
}
