package AER.P400_499;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class P435 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()) {
            String linea = sc.nextLine();
            HashMap<Integer, Integer> mapa = new HashMap<>();
            for (int i = 0; i <=9 ; i++) {
                mapa.put(i,0);
            }
            for (int i = 0; i < linea.length(); i++) {
                int aux = Integer.parseInt(String.valueOf(linea.charAt(i)));
                mapa.put(aux, mapa.get(aux)+1);
            }

            ArrayList<Integer> array = new ArrayList<>(mapa.values());
            boolean b = true;
            int cont = array.get(0);
            for (Integer i:array) {
                if (i != cont) {
                    b = false;
                    break;
                }
            }
            if (b) {
                System.out.println("subnormal");
            } else {
                System.out.println("no subnormal");
            }
            mapa.clear();
        }
    }
}
