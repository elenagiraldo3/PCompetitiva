package AER.P400_499;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class P452 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        while (n != 0) {
            String[] bingo = bf.readLine().split(" ");
            Set<Integer> restas = new HashSet<>();
            for (int i = 0; i < n; i++) {
                for (int j = i+1; j < n; j++) {
                    if (Integer.parseInt(bingo[i]) < Integer.parseInt(bingo[j])) {
                        restas.add(Integer.parseInt(bingo[j]) - Integer.parseInt(bingo[i]));
                    } else {
                        restas.add(Integer.parseInt(bingo[i]) - Integer.parseInt(bingo[j]));
                    }
                }
            }

            List<Integer> resta2 = new ArrayList<>(restas);
            Collections.sort(resta2);
            for (int i = 0; i < resta2.size()-1; i++) {
                System.out.print(resta2.get(i)+" ");
            }
            System.out.println(resta2.get(resta2.size()-1));
            n = Integer.parseInt(bf.readLine());
        }
    }
}
