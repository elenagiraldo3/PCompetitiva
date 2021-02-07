package SPOJ;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class OLOLO {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Set<Integer> pyanis = new HashSet<>();
        while (n > 0) {
            int p = sc.nextInt();
            if (pyanis.contains(p)) {
                pyanis.remove(p);
            } else {
                pyanis.add(p);
            }
            n--;
        }
        for (Integer i:pyanis) {
            System.out.println(i);
        }
    }
}
