package AER.P100_199;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;
import java.util.Stack;

public class P143 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n != -1) {
            Stack<Integer> tortitas = new Stack<>();
            do {
                tortitas.push(n);
                n = sc.nextInt();
            } while (n != -1);
            Deque<Integer> aux = new ArrayDeque<>();
            int vueltas = sc.nextInt();
            for (int i = 0; i < vueltas; i++) {
                int altura = sc.nextInt();
                for (int j = 0; j < altura; j++) {
                    aux.add(tortitas.pop());
                }
                for (int j = 0; j < altura; j++) {
                    tortitas.push(aux.pop());
                }
            }
            System.out.println(tortitas.peek());
            n = sc.nextInt();
        }
    }
}
