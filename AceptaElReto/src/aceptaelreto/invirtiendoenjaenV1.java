package aceptaelreto;


import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author lioalc
 */
public class invirtiendoenjaenV1 {

    // FUNCION RECURSIVA: Devuelve tamaño de la plantacion en (x,y)
    private static int tamPlantacion(char mapa[][], int x, int y) {
        
        // Creamos variable para tamaño
        int tam = 0;
        
        // Comprobamos si esta fuera de rango
        if (x < 0 || y < 0 || x >= mapa.length || y >= mapa[0].length) {
            return 0;
        }

        // Si espacio vacio, devolvemos tamaño 0
        if (mapa[x][y] == ' ') {
            return 0;
        }

        // Si cultivable, tamaño 1 + comprobamos zonas adyacentes
        if (mapa[x][y] == '#') {
            
            // Eliminamos la zona cultivable (x,y) para evitar bucle infinito
            mapa[x][y] = ' ';
            
            // Añadimos 1 (zona cultivable actual)
            tam++;

            // Sumamos tamaño plantacion zonas adyacentes
            tam += tamPlantacion(mapa, x + 1, y);
            tam += tamPlantacion(mapa, x - 1, y);
            tam += tamPlantacion(mapa, x, y + 1);
            tam += tamPlantacion(mapa, x, y - 1);

            // Devolvemos el tamaño
            return tam;
        }

        // Por si el codigo llega aqui (no deberia), devolvemos cero
        return 0;

    }

    // FUNCION MAIN
    public static void main(String[] args) {

        // Creamos el Scanner
        Scanner scan = new Scanner(System.in);

        // Para cada caso de prueba (mientras haya casos)
        while (scan.hasNext()) {

            // Nº filas y columnas
            int filas = scan.nextInt();
            int columnas = scan.nextInt();
            scan.nextLine();

            // Creamos mapa
            char mapa[][] = new char[filas][columnas];

            // Leemos el mapa y lo guardamos
            for (int i = 0; i < filas; i++) {
                String tmp = scan.nextLine();
                for (int j = 0; j < tmp.length(); j++) {
                    mapa[i][j] = tmp.charAt(j);
                }
            }

            // Mostramos por pantalla
            /*for (int i = 0; i < filas; i++) {
                for (int j = 0; j < filas; j++) {
                    System.out.print(mapa[i][j]);
                }
                System.out.println();
            }
             */
            // Buscamos el tamaño de la plantacion en 0,0
            int tam = tamPlantacion(mapa, 0, 0);
            System.out.println(tam);

        }

    }

}
