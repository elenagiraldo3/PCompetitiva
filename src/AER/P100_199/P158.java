package AER.P100_199;

import java.util.Scanner;
public class P158 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0; i<n; i++) {
            int[] jumps = {0,0};
            int m = sc.nextInt();
            int pos = sc.nextInt();
            for(int j=1; j<m; j++) {
                int next = sc.nextInt();

                if (pos < next) {
                    jumps[0]++;
                } else if (pos > next) {
                    jumps[1]++;
                }

                pos = next;
            }
            System.out.println(jumps[0]+" "+jumps[1]);
        }
    }
}
