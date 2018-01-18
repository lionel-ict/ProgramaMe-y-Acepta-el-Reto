package navidad_2017;
import java.util.Scanner;

public class escaparfuerzasimpreriales2 {

	public static int filas, columnas;
	public static int sx, sy, fx, fy;
	// public static char mapa[][];

	// Busca camino
	public static boolean camino(char mapa[][], int x, int y) {

		// Si fuera de rango, no hay camino
		if (x < 0 || y < 0 || x >= filas || y >= columnas) {
			return false;
		}

		// Si espacio vacío, seguimos probando caminos
		if (mapa[x][y] == '.') {
			// Lo marcamos como asteroide, para que no se repita (bucle infinito)
			mapa[x][y] = '*';

			// Si F hacia DERECHA-ABAJO
			if (x <= fx && y <= fy) {
				// Probamos Derecha
				if (camino(mapa, x + 1, y))
					return true;
				// Probamos Abajo
				else if (camino(mapa, x, y + 1))
					return true;
				// Probamos Izquierda
				else if (camino(mapa, x - 1, y))
					return true;
				// Probamos Arriba
				else if (camino(mapa, x, y - 1))
					return true;
				// Si no, ningun camino posible
				else {
					return false;
				}

			} else
			// Si F hacia IZQUIERDA-ABAJO
			if (x > fx && y <= fy) {
				// Probamos Izquierda
				if (camino(mapa, x - 1, y))
					return true;
				// Probamos Abajo
				else if (camino(mapa, x, y + 1))
					return true;
				// Probamos Derecha
				else if (camino(mapa, x + 1, y))
					return true;
				// Probamos Arriba
				else if (camino(mapa, x, y - 1))
					return true;
				// Si no, ningun camino posible
				else {
					return false;
				}

			} else
			// Si F hacia DERECHA-ARRIBA
			if (x <= fx && y > fy) {
				// Probamos Derecha
				if (camino(mapa, x + 1, y))
					return true;
				// Probamos Arriba
				else if (camino(mapa, x, y - 1))
					return true;
				// Probamos Izquierda
				else if (camino(mapa, x - 1, y))
					return true;
				// Probamos Abajo
				else if (camino(mapa, x, y + 1))
					return true;
				// Si no, ningun camino posible a
				else {
					return false;
				}

			} else
			// Si F hacia IZQUIERDA-ARRIBA
			if (x > fx && y > fy) {
				// Probamos Izquierda
				if (camino(mapa, x - 1, y))
					return true;
				// Probamos Arriba
				else if (camino(mapa, x, y - 1))
					return true;
				// Probamos Derecha
				else if (camino(mapa, x + 1, y))
					return true;
				// Probamos Abajo
				else if (camino(mapa, x, y + 1))
					return true;
				// Si no, ningun camino posible
				else {
					return false;
				}
			}
			return false;
		}

		// Si asteroide: NO hay camino
		if (mapa[x][y] == '*') {
			// System.out.println("Encontrado asteroide");
			return false;
		}

		// Si start (S), no seguir por ahí
		// if (mapa[x][y] == 'S')
		// return false;

		// Si final (F), camino encontrado!!
		if (mapa[x][y] == 'F') {
			return true;
		}

		// Otro caso no debería darse nunca
		return false;
	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		// int filas, columnas;
		char mapa[][] = new char[20][20];

		// Mientras haya casos de prueba
		while (scan.hasNext()) {

			// Cuantas Filas y Columnas
			filas = scan.nextInt();
			columnas = scan.nextInt();
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
					if (c == 'F') {
						fx = i;
						fy = j;
					}
				}
			}

			// Marcamos la S como un camino normal
			mapa[sx][sy] = '.';

			// Comprobamos si hay camino desde S hasta F
			if (camino(mapa, sx, sy))
				System.out.println("SI");
			else
				System.out.println("NO");

		}

	}

}
