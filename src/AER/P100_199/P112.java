package AER.P100_199;

import java.util.Scanner;

public class P112 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double distancia = sc.nextDouble();
        double velocidadMax = sc.nextDouble();
        double tiempo = sc.nextDouble();
        while (!(distancia == 0 && velocidadMax == 0 && tiempo == 0)) {
            if (tiempo <= 0 || distancia <= 0 || velocidadMax <= 0) {
                System.out.println("ERROR");
            } else {
                distancia = distancia / 1000;
                tiempo = tiempo / 3600;
                double velocidad = distancia/tiempo;
                if (velocidad <= velocidadMax) {
                    System.out.println("OK");
                } else {
                    if (velocidad < velocidadMax*1.2) {
                        System.out.println("MULTA");
                    } else {
                        System.out.println("PUNTOS");
                    }
                }

            }
            distancia = sc.nextDouble();
            velocidadMax = sc.nextDouble();
            tiempo = sc.nextDouble();
        }
    }
}
