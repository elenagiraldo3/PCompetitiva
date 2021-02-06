package AER.P300_399;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P370 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        while (n>0) {
            String[] linea = bf.readLine().split("-");
            int n1 = Integer.parseInt(linea[0]);
            int n2 = Integer.parseInt(linea[1]);
            if ((n1<n2 && n1%2==0 && n2-n1==1) || (n2<n1 && n2%2==0 && n1-n2==1)) {
                System.out.println("SI");
            } else {
                System.out.println("NO");
            }
            n--;
        }
    }
}
