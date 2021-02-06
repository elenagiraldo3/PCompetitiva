package AER.P500_599;

import java.util.Scanner;

public class P588 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        while (n!=0) {
            String bin = Long.toBinaryString(n);
            while (bin.charAt(0) == '0') {
                bin = bin.substring(1);
            }
            while (bin.charAt(bin.length()-1) == '0') {
                bin = bin.substring(0,bin.length()-1);
            }
            String uno = bin.substring(0,(bin.length()/2));
            String dos;
            if (bin.length() % 2 == 0)
                dos = bin.substring((bin.length()/2));
            else
                dos = bin.substring((bin.length()/2)+1);
            boolean si = true;
            for (int i = 0; i < uno.length(); i++) {
                if (uno.charAt(i) != dos.charAt(dos.length()-i-1)) {
                    si = false;
                    break;
                }
            }
            if (si)
                System.out.println("SI");
            else
                System.out.println("NO");
            n = sc.nextLong();
        }
    }
}
