package AER.P600_699;

import java.util.Scanner;

public class P688 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt()) {
            int c = sc.nextInt();
            int m = sc.nextInt();
            int n = sc.nextInt();

            long first = sc.nextLong();
            long second = sc.nextLong();
            long min_difference = second - first;
            long max_difference = second - first;
            long last_difference = second - first;

            boolean tropiezo = false;

            for (int i=0; i<n-1; i++) {
                first = second;
                second = sc.nextLong();

                if (!tropiezo) {
                    if (Math.abs(second - first - last_difference) > c) {
                        tropiezo = true;
                    }

                    if (second - first < min_difference) {
                        if (max_difference - second + first > m) {
                            tropiezo = true;
                        } else {
                            min_difference = second - first;
                        }
                    }

                    if (second - first > max_difference) {
                        if (second - first - min_difference > m) {
                            tropiezo = true;
                        } else {
                            max_difference = second - first;
                        }
                    }

                    last_difference = second - first;
                }
            }

            if (tropiezo) {
                System.out.println("Tropiezo");
            } else {
                System.out.println("Ok");
            }
        }

    }
}
