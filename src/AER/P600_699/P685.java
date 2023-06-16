package AER.P600_699;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P685 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String[] line = bf.readLine().split(" ");
        int xt = Integer.parseInt(line[0]);
        int yt = Integer.parseInt(line[1]);
        int xi = Integer.parseInt(line[2]);
        int yi = Integer.parseInt(line[3]);
        while (!(xt==0 & yt==0 & xi==0 & yi==0)) {
            if ((xt == xi) || (yt==yi) || (yt-xt == yi-xi) || (yt+xt == yi+xi)) {
                System.out.println("SI");
            } else {
                System.out.println("NO");
            }

            line = bf.readLine().split(" ");
            xt = Integer.parseInt(line[0]);
            yt = Integer.parseInt(line[1]);
            xi = Integer.parseInt(line[2]);
            yi = Integer.parseInt(line[3]);
        }
    }
}
