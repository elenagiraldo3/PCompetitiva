package AER.P500_599;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class P544 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt()) {
            int n = sc.nextInt();
            long p = sc.nextLong();
            ArrayList<Long> num = new ArrayList<>();
            int cont = 0;
            long max = 0;
            for (int i = 0; i < n; i++) {
                long aux = sc.nextLong();
                if (aux <= p/2) {
                    cont++;
                    if (aux > max) {
                        max = aux;
                    }
                } else {
                    num.add(aux);
                }
            }
            Collections.sort(num);
            long lim = p - max;
            for (Long aLong : num) {
                if (aLong <= lim) {
                    cont++;
                    break;
                } else {
                    break;
                }
            }
            System.out.println(cont);
        }
    }
}
