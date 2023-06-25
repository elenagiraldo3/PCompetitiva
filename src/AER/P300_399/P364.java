package AER.P300_399;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P364 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String line = bf.readLine();
        String letters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        while (!line.equals("FIN")) {
            String solution = "";
            for (int i = 0; i < line.length(); i++) {
                if (line.charAt(i) == ' ') {
                    solution += ' ';
                } else if (line.charAt(i) == 'Z'){
                    solution += 'A';
                } else {
                    solution += letters.charAt(1 + letters.indexOf(line.charAt(i)));
                }
            }
            System.out.println(solution);

            line = bf.readLine();
        }
    }
}
