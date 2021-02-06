package SWERC;

import java.util.Scanner;

public class C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n > 0) {
            int year = sc.nextInt();
            System.out.println(year);
            System.out.println(year+2697);
            System.out.println(year-579);
            System.out.println(year-622);
            System.out.println(year-551);
            System.out.println(year+3760);
            System.out.println(year+544);
            System.out.println(year+2333);
            n--;
        }
    }
}
