package AER.P500_599;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class P594 {
    static char[][] matriz;
    static int tx,ty;

    static class Par {
        int x;
        int y;
        int level;

        public Par(int x, int y, int level) {
            this.x = x;
            this.y = y;
            this.level = level;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextLine()) {
            ty = sc.nextInt();
            tx = sc.nextInt();
            matriz = new char[tx][ty];
            int ifila = 0;
            int icol = 0;
            int ffila = 0;
            int fcol = 0;
            sc.nextLine();
            for (int i = tx-1; i >= 0; i--) {
                String linea = sc.nextLine();
                for (int j = 0; j < ty; j++) {
                    matriz[i][j] = linea.charAt(j);
                    if ((i == 0) && matriz[i][j]=='.')
                        icol = j;

                    if (linea.charAt(j)=='T') {
                        ffila = i;
                        fcol = j;
                    }
                }
            }
            int corto = bfs(ifila,icol,ffila,fcol);
            if (corto == -1) {
                System.out.println("IMPOSIBLE");
            } else {
                int der = derecha(ifila,icol);
                if (der == -1) {
                    System.out.println("INF");
                } else if (der == corto) {
                    System.out.println("IGUAL");
                } else {
                    System.out.println(der-corto);
                }
            }
        }
    }

    private static int derecha(int ifila, int icol) {
        int afila = ifila+1;
        int acol = icol;
        char dir = 'R';
        int cont = 1;

        while (!((afila == ifila) && (acol == icol))) {
            switch (dir) {
                case 'R':
                    if (acol < ty - 1) {
                        if (matriz[afila][acol + 1] == 'T')
                            return cont+1;
                        if (matriz[afila][acol + 1] == '.') {
                            cont++;
                            acol++;
                        } else {
                            dir = 'U';
                        }
                    } else {
                        dir = 'U';
                    }
                    break;
                case 'U':
                    if (afila < tx - 1) {
                        if (matriz[afila + 1][acol] == 'T')
                            return cont+1;

                        if (matriz[afila + 1][acol] == '.') {
                            cont++;
                            afila++;
                            dir = 'R';
                        } else {
                            dir = 'L';
                        }
                    } else {
                        dir = 'L';
                    }
                    break;
                case 'L':
                    if (acol > 0) {
                        if (matriz[afila][acol - 1] == 'T')
                            return cont+1;

                        if (matriz[afila][acol - 1] == '.') {
                            cont++;
                            acol--;
                            dir = 'U';
                        } else {
                            dir = 'D';
                        }
                    } else {
                        dir = 'D';
                    }
                    break;
                case 'D':
                    if (afila > 0) {
                        if (matriz[afila - 1][acol] == 'T')
                            return cont+1;

                        if (matriz[afila - 1][acol] == '.') {
                            cont++;
                            afila--;
                            dir = 'L';
                        } else {
                            dir = 'D';
                        }
                    } else {
                        dir = 'D';
                    }
                    break;
            }
        }
        return -1;
    }

    private static int bfs(int ifila, int icol, int ffila, int fcol) {
        boolean[][] visitado = new boolean[tx][ty];
        Queue<Par> cola = new LinkedList<>();
        cola.add(new Par(ifila,icol, 0));
        while(!cola.isEmpty()) {
            Par aux = cola.remove();
            if ((aux.x == ffila) && (aux.y == fcol)) {
                return aux.level;
            }

            if (aux.y > 0) { //izquierda
                if (!visitado[aux.x][aux.y-1]) {
                    visitado[aux.x][aux.y-1] = true;
                    if (matriz[aux.x][aux.y-1] == 'T')
                        return aux.level+1;
                    if (matriz[aux.x][aux.y-1] != '#')
                        cola.add(new Par(aux.x,aux.y-1, aux.level+1));
                }
            }
            if (aux.x > 0) { //abajo
                if (!visitado[aux.x-1][aux.y]) {
                    visitado[aux.x-1][aux.y] = true;
                    if (matriz[aux.x-1][aux.y] == 'T')
                        return aux.level+1;
                    if (matriz[aux.x-1][aux.y] != '#')
                        cola.add(new Par(aux.x-1,aux.y, aux.level+1));
                }
            }
            if (aux.y < ty-1) { //derecha
                if (!visitado[aux.x][aux.y+1]) {
                    visitado[aux.x][aux.y+1] = true;
                    if (matriz[aux.x][aux.y+1] == 'T')
                        return aux.level+1;
                    if (matriz[aux.x][aux.y+1] != '#')
                        cola.add(new Par(aux.x,aux.y+1, aux.level+1));
                }
            }
            if (aux.x < tx-1) { //arriba
                if (!visitado[aux.x+1][aux.y]) {
                    visitado[aux.x+1][aux.y] = true;
                    if (matriz[aux.x+1][aux.y] == 'T')
                        return aux.level+1;
                    if (matriz[aux.x+1][aux.y] != '#')
                        cola.add(new Par(aux.x+1,aux.y, aux.level+1));
                }
            }
        }
        return -1;
    }

}
