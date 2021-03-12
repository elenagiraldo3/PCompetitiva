package AER.P500_599;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P595 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        for (int i = 0; i < n; i++) {
            String linea = bf.readLine();
            System.out.println(linea.substring(0, linea.length()-2));
        }
    }
}
