package AER.P600_699;

import java.util.Scanner;

public class P664 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int bridges = sc.nextInt();
        while (bridges > 0) {
            int max_height = 800;
            for (int bridge=0; bridge<bridges; bridge++) {
                int lanes = sc.nextInt();
                int bridge_height = 1;
                for (int lane=0; lane<lanes; lane++) {
                    bridge_height = Math.max(bridge_height, sc.nextInt());
                }
                max_height = Math.min(max_height, bridge_height);
            }
            System.out.println(max_height);

            bridges = sc.nextInt();
        }
    }
}
