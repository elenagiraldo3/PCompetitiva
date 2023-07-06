package AER.P600_699;


import java.util.Scanner;

public class P699 {

    public static String derivar(String monomio) {
        if (!monomio.contains("x")) {
            return "0";
        }
        if (!monomio.contains("^")) {
            if (monomio.equals("x")) {
                return "1";
            } else {
                return monomio.split("x")[0];
            }
        }
        int exponente = Integer.parseInt(monomio.split("\\^")[1]);
        int coeficiente;
        if (monomio.charAt(0) == 'x') {
            coeficiente = 1;
        } else {
            coeficiente = Integer.parseInt(monomio.split("x")[0]);
        }

        String derivada = exponente * coeficiente + "x";
        if (exponente > 2) {
            derivada += "^" + (exponente - 1);
        }

        return derivada;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while( sc.hasNext()) {
            String[] line = sc.next().split("\\+");
            StringBuilder solucion = new StringBuilder();

            for(String monomio: line) {
                solucion.append(derivar(monomio));
                solucion.append("+");
            }

            solucion.deleteCharAt(solucion.length()-1);
            if (solucion.length() > 2 && solucion.substring(solucion.length()-2, solucion.length()).equals("+0")) {
                solucion.delete(solucion.length()-2, solucion.length());
            }
            System.out.println(solucion);

        }
    }
}
