package AER.P300_399;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class P366 {
    private static class Regalo {
        int b;
        int p;

        public Regalo(int b, int p) {
            this.b = b;
            this.p = p;
        }

    }

    static class Sort implements Comparator<Regalo> {

        @Override
        public int compare(Regalo o1, Regalo o2) {
            if (o1.b > o2.b) {
                return -1;
            } else if (o1.b < o2.b) {
                return 1;
            } else {
                if (o1.p < o2.p) {
                    return -1;
                } else if(o1.p > o2.p) {
                    return 1;
                } else {
                    return 0;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int kids = sc.nextInt();
        while (kids != 0) {
            ArrayList<Regalo> regalos = new ArrayList<>(kids);
            for (int i = 0; i < kids; i++) {
                int b = sc.nextInt();
                int p = sc.nextInt();
                regalos.add(new Regalo(b,p));
            }
            Collections.sort(regalos, new Sort());
            for (int i = 0; i < kids; i++) {
                System.out.println(regalos.get(i).b+" "+regalos.get(i).p);
            }
            System.out.println();
            kids = sc.nextInt();
        }
    }


}
