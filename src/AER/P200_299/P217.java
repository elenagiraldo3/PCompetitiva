package AER.P200_299;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class P217 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        while (n != 0) {
            if (n % 2 == 0) {
                System.out.println("DERECHA");
            } else {
                System.out.println("IZQUIERDA");
            }

            n = Integer.parseInt(bf.readLine());
        }
    }
}
