package AER.P500_599;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P506 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        while (n > 0) {
            String[] linea = bf.readLine().split(" / ");
            if (Integer.parseInt(linea[0]) >= Integer.parseInt(linea[1]))
                System.out.println("BIEN");
            else
                System.out.println("MAL");
            n--;
        }
    }
}
