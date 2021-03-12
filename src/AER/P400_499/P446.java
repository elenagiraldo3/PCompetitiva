package AER.P400_499;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P446 {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        while (n > 0) {
            String[] caso = bf.readLine().split(" ");
            String name = caso[0];
            int tries = Integer.parseInt(caso[1]);
            if (tries == 1) {
                System.out.println("FALSA");
            } else {
                boolean realGrandma = true;
                int i = 0;
                while ((i < tries - 1) && realGrandma) {
                    if (caso[i + 2].equals(name)) {
                        realGrandma = false;
                    }
                    i++;
                }
                if (realGrandma && (!caso[i + 2].equals(name))) {
                    realGrandma = false;
                }
                if (realGrandma) {
                    System.out.println("VERDADERA");
                } else {
                    System.out.println("FALSA");
                }
            }
            n--;
        }
    }
}
