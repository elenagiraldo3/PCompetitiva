package AER.P400_499;

import java.util.Scanner;

public class P456 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num,m,r,area;
        while (n>0) {
            num = sc.nextInt();
            m = sc.nextInt();
            r = sc.nextInt();
            area = num*m;
            if(area % r == 0) {
                System.out.println(r/area);
            } else {
                System.out.println((r/area)+1);
            }
            n--;
        }
    }
}
