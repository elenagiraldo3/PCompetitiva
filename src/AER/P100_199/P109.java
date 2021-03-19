package AER.P100_199;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class P109 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        while (!bf.readLine().equals("FIN")) {
            int partidos = 0;
            int max = 0;
            String ganador = "";
            HashMap<String, Integer> equipos = new HashMap<>();
            String[] linea = bf.readLine().split(" ");
            while (linea.length > 1) {
                partidos++;
                if (Integer.parseInt(linea[1]) > Integer.parseInt(linea[3])) {
                    if (equipos.containsKey(linea[0])) {
                        int aux = equipos.get(linea[0]) + 2;
                        if (aux > max) {
                            max = aux;
                            ganador = linea[0];
                        } else if (aux == max) {
                            ganador = "EMPATE";
                        }
                        equipos.put(linea[0], aux);
                    } else {
                        equipos.put(linea[0], 2);
                        if (max < 2) {
                            max = 2;
                            ganador = linea[0];
                        } else if (max == 2) {
                            ganador = "EMPATE";
                        }
                    }
                    if (equipos.containsKey(linea[2])) {
                        int aux = equipos.get(linea[2]) + 1;
                        equipos.put(linea[2], aux);
                        if (aux > max) {
                            max = aux;
                            ganador = linea[2];
                        } else if (aux == max) {
                            ganador = "EMPATE";
                        }
                    } else {
                        equipos.put(linea[2], 1);
                    }
                } else {
                    if (equipos.containsKey(linea[0])) {
                        int aux = equipos.get(linea[0]) + 1;
                        equipos.put(linea[0], aux);
                        if (aux > max) {
                            max = aux;
                            ganador = linea[0];
                        } else if (aux == max) {
                            ganador = "EMPATE";
                        }
                    } else {
                        equipos.put(linea[0], 1);
                    }
                    if (equipos.containsKey(linea[2])) {
                        int aux = equipos.get(linea[2]) + 2;
                        equipos.put(linea[2], aux);
                        if (aux > max) {
                            max = aux;
                            ganador = linea[2];
                        } else if (aux == max) {
                            ganador = "EMPATE";
                        }
                    } else {
                        equipos.put(linea[2], 2);
                        if (max < 2) {
                            max = 2;
                            ganador = linea[2];
                        } else if (max == 2) {
                            ganador = "EMPATE";
                        }
                    }

                }
                linea = bf.readLine().split(" ");
            }
            int total = (equipos.size()*(equipos.size()-1));
            System.out.println(ganador + " " + (total-partidos));
        }
    }
}
