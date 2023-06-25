package AER.P400_499;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class P428 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        int midiclorianos;
        int numerode4;
        while(n != 0) {
            midiclorianos = Integer.parseInt(bf.readLine());
            numerode4 = 0;
            //Pasamos a base 5
            while(midiclorianos >= 5 && numerode4 < 2) {
                if (midiclorianos%5==4) {
                    numerode4++;
                }
                midiclorianos = midiclorianos/5;
            }
            if (numerode4 >= 2) {
                System.out.println("SI");
            } else if (numerode4==1 && midiclorianos==4) {
                System.out.println("SI");
            } else {
                System.out.println("NO");
            }

            n--;
        }
    }
}
