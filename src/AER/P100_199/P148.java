package AER.P100_199;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class P148 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String[] tiempo = bf.readLine().split(":");
        while (!(tiempo[0].equals("00") && tiempo[1].equals("00"))) {
            int hora = Integer.parseInt(tiempo[0]);
            int minuto = Integer.parseInt(tiempo[1]);
            System.out.println((23-hora)*60 + (60-minuto));
            tiempo = bf.readLine().split(":");
        }

    }
}
