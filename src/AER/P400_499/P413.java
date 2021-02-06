package AER.P400_499;

import java.util.Scanner;

public class P413 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int alto, ancho, area;
        while (n > 0) {
            alto = sc.nextInt();
            ancho = sc.nextInt();
            area = alto*ancho;
            if (area % 2 == 0) {
                System.out.println(area/2 + " " + area/2);
            } else {
                System.out.println(((area/2)+1) + " " + ((area/2)));
            }
            n--;
        }
    }
}
