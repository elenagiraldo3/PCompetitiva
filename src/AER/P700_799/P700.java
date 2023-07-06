package AER.P700_799;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class P700 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        while (n != 0) {
            HashMap<String, Integer> series = new HashMap<>(n);
            for (int i=0; i<n; i++) {
                String[] line = bf.readLine().split(" ", 2);
                int minutes = Integer.parseInt(line[0]);
                String serie = line[1];
                if (!series.containsKey(serie)) {
                    series.put(serie, minutes);
                } else {
                    minutes += series.get(serie);
                    series.put(serie, minutes);
                }
            }

            List<Map.Entry<String, Integer>> orderedList = new ArrayList<>(series.entrySet());

            Collections.sort(orderedList, new Comparator<Map.Entry<String, Integer>>() {
                @Override
                public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                    int valueComparison = o2.getValue().compareTo(o1.getValue());
                    if (valueComparison == 0) {
                        return o1.getKey().compareTo(o2.getKey());
                    }
                    return valueComparison;
                }
            });

            for(int i=0; i<3; i++) {
                if (i >= orderedList.size()) {
                    break;
                }
                if (orderedList.get(i).getValue() >= 30) {
                    System.out.println(orderedList.get(i).getKey());
                } else {
                    break;
                }
            }
            

            System.out.println("---");
            n = Integer.parseInt(bf.readLine());
        }
    }
}
