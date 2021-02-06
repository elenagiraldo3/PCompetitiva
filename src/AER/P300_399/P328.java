package AER.P300_399;

import java.util.Scanner;

public class P328 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n>0) {
            int y = sc.nextInt();
            int x = sc.nextInt();
            int [][] matriz = new int[x][y];
            int pollitos = sc.nextInt();
            while (pollitos > 0) {
                int y_pollito = sc.nextInt();
                int x_pollito = sc.nextInt();
                char direccion_p = sc.next().charAt(0);
                char direccion_a = direccion_p;
                int aguante = sc.nextInt();
                int avance = 0;
                matriz[x_pollito-1][y-y_pollito]++;
                while ((aguante>0) && (x_pollito<=x) && (x_pollito>0) && (y_pollito<=y) && (y_pollito>0)) {
                    switch (direccion_a) {
                        case 'N':
                            if (direccion_p == 'N' || direccion_p == 'S') {
                                avance++;
                            }
                            for (int i = 0; i < avance; i++) {
                                y_pollito--;
                                if (y_pollito > 0 && aguante>0) {
                                    matriz[x_pollito-1][y-y_pollito]++;
                                    direccion_a = 'E';
                                } else {
                                    break;
                                }
                                aguante--;
                            }
                            break;
                        case 'E':
                            if (direccion_p == 'W' || direccion_p == 'E') {
                                avance++;
                            }
                            for (int i = 0; i < avance; i++) {
                                x_pollito++;
                                if (x_pollito <= x && aguante>0) {
                                    matriz[x_pollito-1][y-y_pollito]++;
                                    direccion_a = 'S';
                                } else {
                                    break;
                                }
                                aguante--;
                            }
                            break;
                        case 'S':
                            if (direccion_p == 'N' || direccion_p == 'S') {
                                avance++;
                            }
                            for (int i = 0; i < avance; i++) {
                                y_pollito++;
                                if (y_pollito<=y && aguante>0) {
                                    matriz[x_pollito-1][y-y_pollito]++;
                                    direccion_a = 'W';
                                } else {
                                    break;
                                }
                                aguante--;
                            }
                            break;
                        default:
                            if (direccion_p == 'W' || direccion_p == 'E') {
                                avance++;
                            }
                            for (int i = 0; i < avance; i++) {
                                x_pollito--;
                                if (x_pollito > 0 && aguante>0) {
                                    matriz[x_pollito-1][y-y_pollito]++;
                                    direccion_a = 'N';
                                } else {
                                    break;
                                }
                                aguante--;
                            }
                            break;
                    }
                }
                pollitos--;
            }
            for (int i = 1; i <= y; i++) {
                for (int j = 0; j < x; j++) {
                    if (j != x-1) {
                        System.out.print(matriz[j][y-i] + " ");
                    }else{
                        System.out.print(matriz[j][y-i]);
                    }
                }
                System.out.println("");
            }
            System.out.println("---");
            n--;
        }
    }
}
