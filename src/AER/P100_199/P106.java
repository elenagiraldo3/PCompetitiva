package AER.P100_199;

import java.util.Scanner;

public class P106 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String codigo = sc.nextLine();
        while (!codigo.equals("0")) {
            if (codigo.length() < 14) {
                int[] separado = new int[codigo.length()];
                for (int i = 0; i < codigo.length(); i++) {
                    separado[i] = Integer.parseInt(String.valueOf(codigo.charAt(i)));
                }
                int error = separado[codigo.length() - 1];
                long comp = 0;
                for (int i = 0; i < separado.length - 1; i++) {
                    if (i % 2 == 0) {
                        comp += separado[separado.length - i - 2] * 3;
                    } else {
                        comp += separado[separado.length - i - 2];
                    }
                }
                int resultado;
                if (comp % 10 == 0) {
                    resultado = 0;
                } else {
                    resultado = (int) (10 - (comp % 10));
                }

                if (resultado == error) {
                    if (separado.length > 8) {
                        if (separado.length < 13) {
                            System.out.println("SI EEUU");
                        } else {
                            if (separado[0] == 0) {
                                System.out.println("SI EEUU");
                            } else if ((separado[0] * 10 + separado[1]) == 50) {
                                System.out.println("SI Inglaterra");
                            } else if ((separado[0] * 10 + separado[1]) == 70) {
                                System.out.println("SI Noruega");
                            } else {
                                int i = separado[0] * 100 + separado[1] * 10 + separado[2];
                                if (i == 380) {
                                    System.out.println("SI Bulgaria");
                                } else if (i == 539) {
                                    System.out.println("SI Irlanda");
                                } else if (i == 560) {
                                    System.out.println("SI Portugal");
                                } else if (i == 759) {
                                    System.out.println("SI Venezuela");
                                } else if (i == 850) {
                                    System.out.println("SI Cuba");
                                } else if (i == 890) {
                                    System.out.println("SI India");
                                } else {
                                    System.out.println("SI Desconocido");
                                }
                            }
                        }
                    } else {
                        System.out.println("SI");
                    }
                } else {
                    System.out.println("NO");
                }
            } else {
                System.out.println("NO");
            }
            codigo = sc.nextLine();
        }
    }
}
