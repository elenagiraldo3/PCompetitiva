package AER.P600_699;

import java.util.Scanner;

public class P687 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int vertices = sc.nextInt();
        while (vertices != 0) {

            int aristas = 0;
            int init = sc.nextInt();
            int end = sc.nextInt();
            while (!(init == 0 & end == 0)) {
                init = sc.nextInt();
                end = sc.nextInt();
                aristas++;
            }

            System.out.println(aristas - vertices + 1);
            vertices = sc.nextInt();

        }
    }

}
