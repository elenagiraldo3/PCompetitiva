package AER.P100_199;

import java.util.Scanner;
import java.util.Stack;

public class P141 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String linea = sc.nextLine();
            Stack<Character> pila = new Stack<>();
            pila.push('1');
            boolean balanceado = true;
            for (int i = 0; i < linea.length(); i++) {
                char aux = linea.charAt(i);
                char aux2;
                switch (aux) {
                    case '(':
                    case '{':
                    case '[':
                        pila.push(aux);
                        break;
                    case ')':
                        aux2 = pila.pop();
                        if (aux2 != '(') {
                            balanceado = false;
                        }
                        break;
                    case '}':
                        aux2 = pila.pop();
                        if (aux2 != '{') {
                            balanceado = false;
                        }
                        break;
                    case ']':
                        aux2 = pila.pop();
                        if (aux2 != '[') {
                            balanceado = false;
                        }
                        break;
                }

                if (!balanceado) {
                    break;
                }
            }

            if (balanceado) {
                if (pila.size() == 1) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            } else {
                System.out.println("NO");
            }
        }
    }
}
