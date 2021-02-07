package AER.P300_399;

import java.util.Scanner;

public class P325 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n > 0) {
            int c = sc.nextInt();
            int v = sc.nextInt();
            String sol = permutar(c,v,"");
            System.out.println(sol.substring(0,sol.length()-1));
            n--;
        }
    }

    private static String permutar(int c, int v, String cadena) {
        String aux = "";
        if (c == 0) {
            aux = cadena;
            for (int i = 0; i < v; i++) {
                aux += 'V';
            }
            aux += " ";
        }
        else if (v == 0) {
            aux = cadena;
            for (int i = 0; i < c; i++) {
                aux += 'C';
            }
            aux += " ";
        }
        else {
            aux += permutar(c-1,v,cadena+"C");
            aux += permutar(c,v-1,cadena+"V");
        }
        return aux;

    }
}
