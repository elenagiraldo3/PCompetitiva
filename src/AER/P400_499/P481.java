package AER.P400_499;

import java.util.Scanner;

public class P481 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] letters = {'h','g','f','e','d','c','b','a'};
        int row = sc.nextInt();
        int column = sc.nextInt();
        while ((row != 0) && (column != 0)) {
            System.out.println(letters[row-1]+String.valueOf(column));
            row = sc.nextInt();
            column = sc.nextInt();
        }
    }
}
