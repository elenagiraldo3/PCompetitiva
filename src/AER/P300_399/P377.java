package AER.P300_399;

import java.math.BigInteger;
import java.util.Scanner;

public class P377 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigInteger dieciseis = new BigInteger("16");
        BigInteger cero = new BigInteger("0");
        BigInteger uno = new BigInteger("1");
        BigInteger cuatro = new BigInteger("4");
        BigInteger nueve = new BigInteger("9");
        while (sc.hasNextBigInteger()) {
            BigInteger n = sc.nextBigInteger();
            BigInteger modulo = n.mod(dieciseis);
            if (modulo.equals(cero) || modulo.equals(uno) || modulo.equals(cuatro) || modulo.equals(nueve)) {
                System.out.println("NO SE");
            } else {
                System.out.println("IMPERFECTO");
            }
        }
    }
}
