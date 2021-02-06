package AER.P200_299;

import java.util.Scanner;

public class P219 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n > 0) {
            int casos = sc.nextInt();
            int cont = 0;
            while (casos > 0) {
                if (sc.nextInt() % 2 == 0)
                    cont++;
                casos--;
            }
            System.out.println(cont);
            n--;
        }
    }
}
