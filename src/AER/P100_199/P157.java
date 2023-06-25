package AER.P100_199;

import java.util.Scanner;

public class P157 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int solution;
        for(int i=0; i<n; i++) {
            int day = sc.nextInt();
            int month = sc.nextInt();
            solution = 31 - day;
            switch (month) {
                case 1:
                    solution += 334;
                    break;
                case 2:
                    solution += 303;
                    break;
                case 3:
                    solution += 275;
                    break;
                case 4:
                    solution += 244;
                    break;
                case 5:
                    solution += 214;
                    break;
                case 6:
                    solution += 183;
                    break;
                case 7:
                    solution += 153;
                    break;
                case 8:
                    solution += 122;
                    break;
                case 9:
                    solution += 91;
                    break;
                case 10:
                    solution += 61;
                    break;
                case 11:
                    solution += 30;
                    break;
            }
            System.out.println(solution);
        }
    }
}
