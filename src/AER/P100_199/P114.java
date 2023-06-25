package AER.P100_199;

import java.util.Scanner;

public class P114 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0; i<n; i++) {
            int number = sc.nextInt();
            int solution;
            if (number == 0) {
                solution = 1;
            } else if (number == 3) {
                solution = 6;
            } else if (number >= 5) {
                solution = 0;
            } else {
                solution = number;
            }
            System.out.println(solution);
        }
    }
}
