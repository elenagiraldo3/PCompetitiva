package AER.P600_699;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P665 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        while (n > 0) {
            String[] versions = bf.readLine().split(" ");

            int major1 = Integer.parseInt(versions[0].split("\\.")[0]);
            int major2 = Integer.parseInt(versions[1].split("\\.")[0]);
            int minor1 = Integer.parseInt(versions[0].split("\\.")[1]);
            int minor2 = Integer.parseInt(versions[1].split("\\.")[1]);
            int patch1 = Integer.parseInt(versions[0].split("\\.")[2]);
            int patch2 = Integer.parseInt(versions[1].split("\\.")[2]);

            if (((major1 == major2) && (minor1 == minor2) && (patch2 == patch1 + 1)) || ((major1 == major2) && (minor2 == minor1 + 1) && (patch2 == 0)) || ((major2 == major1 + 1) && (minor2 == 0) && (patch2 == 0))) {
                System.out.println("SI");
            } else {
                System.out.println("NO");
            }
            n--;
        }
    }
}
