package SPOJ;

import java.util.Scanner;

public class ACT {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t > 0) {
            String[] linea = sc.nextLine().split(" ");
            System.out.println(linea[1].charAt(linea[1].length()-1));
            t--;
        }

    }
    
}
