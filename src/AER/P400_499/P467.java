package AER.P400_499;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P467 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        while (n != 0) {
            String[] frase = bf.readLine().split(" ");
            if (frase[0].equalsIgnoreCase(frase[2])) {
                System.out.println("TAUTOLOGIA");
            } else {
                System.out.println("NO TAUTOLOGIA");
            }
            n--;
        }
    }
}
