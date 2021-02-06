package AER.P100_199;

import java.util.Scanner;

public class P191 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int comp, litgran, dif, resultado;
        while (n>0) {
            comp = sc.nextInt();
            litgran = sc.nextInt();
            dif = sc.nextInt();
            resultado = litgran;
            while (comp-1 > 0) {
                litgran = litgran-dif;
                resultado += litgran;
                comp--;
            }
            System.out.println(resultado);
            n--;
        }
    }
}
