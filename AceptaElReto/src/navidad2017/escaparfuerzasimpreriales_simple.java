package navidad2017;

import java.util.Scanner;

public class escaparfuerzasimpreriales_simple {

    // Busca camino
    public static boolean camino(char mapa[][], int x, int y) {

        // Nº de filas y de columnas
        int filas = mapa.length;
        int columnas = mapa[0].length;

        // Si fuera de rango, no hay camino
        if (x < 0 || y < 0 || x >= filas || y >= columnas) {
            return false;
        }

        // Si (x,y) es un espacio vacio, probando caminos
        if (mapa[x][y] == '.' || mapa[x][y] == 'S') {

            // Lo marcamos como asteroide, para que no se vuelva a
            // comprobar por otra funcion recursivas (bucle infinito)
            mapa[x][y] = '*';

            // Probamos Derecha
            if (camino(mapa, x + 1, y)) {
                return true;
            } // Si no, ningun camino posible
            else {
                return false;
            }
        }

        // Si (x,y) es un asteroide: NO hay camino
        if (mapa[x][y] == '*') {
            // System.out.println("Encontrado asteroide");
            return false;
        }

        // Si (x,y) es F, camino encontrado!!
        if (mapa[x][y] == 'F') {
            return true;
        }

        // Otro caso no deberia darse nunca
        return false;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        
        int sx = -1;
        int sy = -1;
        
        // int filas, columnas;
        char mapa[][] = new char[20][20];

        // Mientras haya casos de prueba
        while (scan.hasNext()) {

            // Cuantas Filas y Columnas
            int filas = scan.nextInt();
            int columnas = scan.nextInt();
            scan.nextLine();

            // Procesamos las Filas
            for (int i = 0; i < filas; i++) {
                String str = scan.nextLine();
                for (int j = 0; j < columnas; j++) {
                    char c = str.charAt(j);
                    mapa[i][j] = c;
                    if (c == 'S') {
                        sx = i;
                        sy = j;
                    }
                }
            }

            // Comprobamos si hay camino desde S hasta F
            if (camino(mapa, sx, sy)) {
                System.out.println("SI");
            } else {
                System.out.println("NO");
            }

        }

    }

}
