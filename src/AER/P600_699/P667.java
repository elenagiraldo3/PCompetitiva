package AER.P600_699;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class P667 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String year = bf.readLine();
        while (!year.equals("0")) {
            String[] grapes = bf.readLine().split(" ");
            Map<Integer, Integer> numbers = new HashMap<>();
            for (int i=0; i<4; i++) {
                int digit = Integer.parseInt(String.valueOf(year.charAt(i)));
                if (numbers.containsKey(digit)) {
                    int value = numbers.get(digit);
                    numbers.put(digit, value+3);
                } else {
                    numbers.put(digit, 3);
                }
            }

            int persons = Integer.MAX_VALUE;
            for (Map.Entry<Integer, Integer> needs: numbers.entrySet()) {
                persons = Math.min(persons, Integer.parseInt(grapes[needs.getKey()])/needs.getValue());
            }

            System.out.println(persons);

            year = bf.readLine();
        }
    }
}
