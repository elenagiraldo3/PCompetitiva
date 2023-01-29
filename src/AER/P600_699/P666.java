package AER.P600_699;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P666 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        while (n > 0) {
            String line1 = bf.readLine();
            String line2 = bf.readLine();

            // Delete spaces
            line1 = line1.replace(" ", "");
            line2 = line2.replace(" ", "");

            //Delete dots
            line1 = line1.replace(".", "");
            line2 = line2.replace(".", "");

            //Delete commas
            line1 = line1.replace(",", "");
            line2 = line2.replace(",", "");

            //Delete semicolons
            line1 = line1.replace(";", "");
            line2 = line2.replace(";", "");

            //Delete colons
            line1 = line1.replace(":", "");
            line2 = line2.replace(":", "");

            if (line1.equalsIgnoreCase(line2)) {
                System.out.println("SI");
            } else {
                System.out.println("NO");
            }

            n--;
        }
    }
}
