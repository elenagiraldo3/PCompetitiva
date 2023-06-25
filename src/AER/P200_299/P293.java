package AER.P200_299;

import java.util.Scanner;
public class P293 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n != 0) {
            long solucion;
            solucion = sc.nextInt() * 6;
            solucion += sc.nextInt() * 8;
            solucion += sc.nextInt() * 10;
            int escolopendras = sc.nextInt();
            int anillos = sc.nextInt();
            solucion += (escolopendras*anillos*2);
            System.out.println(solucion);
            n--;
        }
    }
}
