package AER.P400_499;

import java.util.Scanner;

public class P440 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n!=0) {
            int max,min,grupos,anterior,cont;
            grupos = 0;
            min = n;
            max = 0;
            anterior = sc.nextInt();
            cont = 1;
            for (int i = 1; i < n; i++) {
                if (i >= anterior) {
                    cont++;
                } else {
                    grupos++;
                    if (min > cont) {
                        min = cont;
                    }
                    if (max < cont) {
                        max = cont;
                    }
                    cont = 0;
                }
                anterior = i;
            }
            System.out.println(grupos+" "+min+" "+max);
            n = sc.nextInt();
        }
    }
}
