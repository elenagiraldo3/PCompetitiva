package AER.P500_599;

import java.util.Scanner;

public class P596 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextLine()) {
            String[] line = scanner.nextLine().split("");

            StringBuilder solucion = new StringBuilder();
            int i = 0;
            while (i < line.length-2) {
                if (!line[i].equals(".") && line[i+1].equals(".") && line[i+2].equals(".")) {
                    solucion.append(line[i]);
                    i += 2;
                } else {
                    i++;
                }
            }

            System.out.println(solucion);

        }
    }
}
