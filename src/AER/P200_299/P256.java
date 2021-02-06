package AER.P200_299;

import java.util.Scanner;

public class P256 {
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()) {
            String[] linea = sc.nextLine().split(" ");
            StringBuilder n1 = new StringBuilder(linea[0]);
            StringBuilder n2 = new StringBuilder(linea[1]);
            StringBuilder n3 = new StringBuilder(linea[2]);
            StringBuilder n = new StringBuilder();
            int max = Math.max(n1.length(), n2.length());
            max = Math.max(max, n3.length());
            while (n1.length() < max) {
                n1.insert(0, "0");
            }
            while (n2.length() < max) {
                n2.insert(0, "0");
            }
            while (n3.length() < max) {
                n3.insert(0, "0");
            }

            for (int i = 0; i < max; i++) {
                if (n1.charAt(i) == n2.charAt(i)) {
                    n.append(n1.charAt(i));
                } else if ((n3.charAt(i) == n1.charAt(i)) || (n3.charAt(i) == n2.charAt(i))) {
                    n.append(n3.charAt(i));
                } else {
                    break;
                }
            }
            if (n.length() == max) {
                System.out.println(Integer.parseInt(String.valueOf(n)));
            } else {
                System.out.println("RUIDO COSMICO");
            }
        }

    }
}
