package AER.P100_199;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P140 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String n = bf.readLine();
        while (n.charAt(0) != '-') {
            int cont = 0;
            for (int i = 0; i < n.length()-1; i++) {
                System.out.print(n.charAt(i)+" + ");
                cont += Integer.parseInt(String.valueOf(n.charAt(i)));
            }
            cont += Integer.parseInt(n.substring(n.length()-1));
            System.out.println(n.charAt(n.length()-1)+" = "+cont);
            n = bf.readLine();
        }
    }
}
