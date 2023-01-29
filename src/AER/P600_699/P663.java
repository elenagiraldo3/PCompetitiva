package AER.P600_699;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P663 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        while (n > 0) {
            int year = Integer.parseInt(bf.readLine());
            if (year < 0) {
                System.out.println(year);
            } else {
                System.out.println(year - 1);
            }

            n--;
        }
    }
}
