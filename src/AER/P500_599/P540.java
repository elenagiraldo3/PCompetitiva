package AER.P500_599;

import java.util.Scanner;

public class P540 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n > 0) {
            int piso = sc.nextInt();
            int escalones = sc.nextInt();
            int p_subidos = sc.nextInt();
            int adicionales = sc.nextInt();
            int bajar = p_subidos*escalones + adicionales;
            int subir = piso*escalones + p_subidos*escalones + adicionales;
            System.out.println(bajar + " " + subir);
            n--;
        }
    }
}
