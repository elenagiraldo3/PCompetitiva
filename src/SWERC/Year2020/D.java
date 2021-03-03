package SWERC.Year2020;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class D {
    static HashMap<String, ArrayList<ArrayList<Character>>> map = new HashMap<>();

    private static void input(String linea1) {
        int cont = 97;
        ArrayList<ArrayList<Character>> array = new ArrayList<>();
        int i = 0;
        boolean fail = false;
        while (map.containsKey(linea1.substring(0,i))) {
            i++;
        }
        if (i == 0) {
            for (int j = 0; j < 3; j++) {
                array.add(new ArrayList<>((char) cont));
                cont++;
            }
        } else {
            array = map.get(linea1.substring(0,i));
        }

        for (int j = i; j < linea1.length(); j++) {
            if (fail) {
                break;
            }
            char c = linea1.charAt(j);
            ArrayList<Character> aux;
            switch (c) {
                case 'C':
                    array.add(0, array.get(0));
                    break;
                case 'D':
                    array.remove(0);
                    while (array.size() < 3) {
                        array.add(new ArrayList<>((char) cont));
                        cont++;
                    }
                    break;
                case 'L':
                    if (array.get(0).size() == 1) {
                        fail = true;
                    } else {
                        aux = array.remove(0);
                        array.add(0, new ArrayList<>(aux.get(0)));
                    }
                    break;
                case 'P':
                    
            }
        }
        if (fail) {
            map.put(linea1, null);
        } else {
            map.put(linea1, array);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String linea1 = sc.next();
            String linea2 = sc.next();
            ArrayList<ArrayList<Character>> solution1, solution2;
            input(linea1);
            input(linea2);
            solution1 = map.get(linea1);
            solution2 = map.get(linea2);
            boolean b = true;
            if (solution1.size() == solution2.size()) {
                for (int i = 0; i < solution1.size(); i++) {
                    if (!solution1.get(i).equals(solution2.get(i))) {
                        b = false;
                        break;
                    }
                }
            } else {
                b = false;
            }

            if (b) {
                System.out.println("True");
            } else {
                System.out.println("False");
            }
        }
    }


}
