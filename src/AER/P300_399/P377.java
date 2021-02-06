package AER.P300_399;

import java.util.Scanner;

public class P377 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLong()) {
            long n = sc.nextLong();
            String h = Long.toHexString(n);
            char mod = h.charAt(h.length()-1);
            if ((mod=='0' || mod=='1' || mod=='4' || mod=='9')) {
                System.out.println("NO SE");
            } else {
                System.out.println("IMPERFECTO");
            }
        }
    }
}
