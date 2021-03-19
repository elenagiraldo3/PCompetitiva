package AER.P100_199;

import java.util.LinkedList;
import java.util.Scanner;

public class P142 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ninos = sc.nextInt();
        int saltos = sc.nextInt();
        while (!(ninos == 0 && saltos == 0)) {
            LinkedList<Integer> lista = new LinkedList<>();
            for (int i = 1; i <= ninos; i++) {
                lista.add(i);
            }
            int cont = 0;
            while (lista.size() > 1) {
                for (int i = 0; i < saltos; i++) {
                    cont = (cont+1)%lista.size();
                }
                lista.remove(cont);
            }
            System.out.println(lista.remove(0));
            ninos = sc.nextInt();
            saltos = sc.nextInt();
        }
    }
}
