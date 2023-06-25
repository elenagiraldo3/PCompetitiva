package AER.P300_399;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P300 {
    public static void main(String[] args) throws IOException {
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(sc.readLine());
        String word = "";
        for(int i = 0; i < n; i++) {
            word = sc.readLine();
            if (word.contains("a") && word.contains("e") && word.contains("i") && word.contains("o") && word.contains("u")) {
                System.out.println("SI");
            } else {
                System.out.println("NO");
            }
        }
    }
}
