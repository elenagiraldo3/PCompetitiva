package AER.P400_499;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P439 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        while(n != 0) {
            String[] line = bf.readLine().split(" ");
            char dato1 = line[0].charAt(0);
            char dato2 = line[1].charAt(0);
            int numero1 = Integer.parseInt(line[0].substring(2));
            int numero2 = Integer.parseInt(line[1].substring(2));

            switch (dato1) {
                case 'V':
                    switch (dato2) {
                        case 'D':
                            System.out.println("T="+(numero2/numero1));
                            break;
                        case 'T':
                            System.out.println("D="+(numero1*numero2));
                            break;
                    }
                    break;
                case 'D':
                    switch (dato2) {
                        case 'V':
                            System.out.println("T="+(numero1/numero2));
                            break;
                        case 'T':
                            System.out.println("V="+(numero1/numero2));
                            break;
                    }
                    break;
                case 'T':
                    switch (dato2) {
                        case 'V':
                            System.out.println("D="+(numero1*numero2));
                            break;
                        case 'D':
                            System.out.println("V="+(numero2/numero1));
                            break;
                    }
                    break;
            }

            n--;
        }
    }
}
