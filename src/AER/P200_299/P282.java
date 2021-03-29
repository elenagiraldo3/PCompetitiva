package AER.P200_299;

import java.util.Scanner;

public class P282 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt()) {
            int n = sc.nextInt();
            int l = sc.nextInt();
            int parches = 1;
            int limit = sc.nextInt() + l;
            for (int i = 1; i < n; i++) {
                int aux = sc.nextInt();
                if (aux > limit) {
                    parches++;
                    limit = aux + l;
                }
            }
            System.out.println(parches);
        }
    }
}
