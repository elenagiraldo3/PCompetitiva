package AER.P600_699;

import java.util.Scanner;

public class P690 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int c = sc.nextInt();
        int f = sc.nextInt();
        while (!(f==0 && c==0)) {
            float area = 0;
            String line = sc.nextLine();
            for (int i = 0; i<f; i++) {
                line = sc.nextLine();
                int contador = 0;
                for (int j=0; j<c; j++) {
                    if (line.charAt(j) == '.' && contador % 2 == 1) {
                        area++;
                    }
                    if (line.charAt(j) == '/' || line.charAt(j) == '\\') {
                        area += 0.5;
                        contador++;
                    }
                }
            }
            System.out.println((int) area);

            c = sc.nextInt();
            f = sc.nextInt();
        }
    }
}
