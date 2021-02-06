package AER.P400_499;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P437 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        while (n>0) {
            String[] linea = bf.readLine().split(":");
            String hora,min,seg;
            seg = String.valueOf(60 - Integer.parseInt(linea[2]));
            if (seg.equals("60")) {
                seg = "00";
                min = String.valueOf(60 - Integer.parseInt(linea[1]));
                if (min.equals("60")) {
                    min = "00";
                    hora = String.valueOf(24 - Integer.parseInt(linea[0]));
                } else {
                    hora = String.valueOf(23 - Integer.parseInt(linea[0]));
                }
            } else {
                min = String.valueOf(59 - Integer.parseInt(linea[1]));
                hora = String.valueOf(23 - Integer.parseInt(linea[0]));
            }
            if (seg.length() == 1) {
                seg = "0" + seg;
            }
            if (min.length() == 1) {
                min = "0" + min;
            }
            if (hora.length() == 1) {
                hora = "0" + hora;
            }
            System.out.println(hora+":"+min+":"+seg);
            n--;
        }
    }
}
