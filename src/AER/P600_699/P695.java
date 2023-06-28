package AER.P600_699;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class P695 {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String N = bf.readLine();
        while (!(N.length() == 1 && N.charAt(0) == '0')) {
            int[] number = new int[N.length()];
            for (int i=0; i<N.length(); i++) {
                number[i] = Integer.parseInt(String.valueOf(N.charAt(i)));
            }
            Arrays.sort(number);
            int small = 0;
            int big = 0;
            for (int i=0; i<number.length; i++) {
               small *= 10;
               big *= 10;
               small += number[i];
               big += number[number.length - 1 - i];
            }
            System.out.println(big + " - " + small + " = " + (big-small) + " = " + (big-small)/9 + " x 9");

            N = bf.readLine();
        }
    }
}
