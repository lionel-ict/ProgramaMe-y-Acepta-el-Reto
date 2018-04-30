
import java.util.Scanner;

public class piramide_domino4 {

	// Devuelve el número máximo de filas para solucionar Fx fichas
	// public static final int maxFilas(int Fx) {
	// return (-1 + (int)Math.sqrt(8 * Fx + 1)) / 2;
	// }

	// Indica si es posible hacer Fl filas con Fx fichas
	// public static final boolean posible(int Fx, int Fl) {

	// Mínimo de fichas necesarias
	// int min = (Fl * Fl + Fl) / 2;

	// Comprobamos si llega al mínimo
	// if (Fx < min)
	// return false;

	// Si filas es PAR: El resto de fichas/filas debe ser filas/2
	// if (Fl % 2 == 0) {
	// if ((Fx % Fl) == (Fl / 2)) {
	// return true;
	// } else
	// return false;
	// }
	// Si filas es IMPAR: El resto de fichas/filas debe ser 0
	// else {
	// if ((Fx % Fl) == 0) {
	// return true;
	// } else
	// return false;
	// }

	// }

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int N;
		int sol;
		int maxF;

		// Mientras hayan casos de prueba
		while (scan.hasNext()) {

			// Número a probar
			N = scan.nextInt();

			// Solución inicial (peor): 1 fila
			sol = 1;

			// Maximo de filas
			maxF = (-1 + (int) Math.sqrt(8 * N + 1)) / 2;

			// Probamos desde maxF filas hasta 1 (decremental)
			for (int i = maxF; i > 1; i--) {
				// if (posible(N, i)) {
				// sol = i;
				// break;
				// }

				// Si filas es PAR: El resto de (fichas/filas) debe ser (filas/2)
				if (i % 2 == 0) {
					if ((N % i) == (i / 2)) {
						sol = i;
						break;
					}
				}
				// Si filas es IMPAR: El resto de (fichas/filas) debe ser 0
				else {
					if ((N % i) == 0) {
						sol = i;
						break;
					}
				}

			}

			// Mostramos la solución
			System.out.println(sol);
		}

	}

}
