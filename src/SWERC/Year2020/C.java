package SWERC.Year2020;

import java.util.HashSet;
import java.util.Scanner;

public class C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt()) {
            int n = sc.nextInt();
            int limit = (n % 10) + 2;
            HashSet<Integer> set = new HashSet<>();
            int solution = 0;
            for (int i = 0; i < n; i++) {
                String aux = sc.next();
                if ((aux.charAt(0) != '-') && (aux.length()<=limit)) {
                    int number = Integer.parseInt(aux);
                    if (number == solution) {
                        solution++;
                        while (set.contains(solution)) {
                            solution++;
                        }
                    } else {
                        set.add(number);
                    }
                }

            }
            System.out.println(solution);
        }
    }
}
