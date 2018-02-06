package aceptaelreto;

import java.util.Scanner;

public class organizandohangares2 {

	// public static int h, n;

	// HANGARES: Vector que hay que mantener ordenado de mayor a menor
	public static int H[] = new int[10];
	public static int tamH; // tama�o del vector
	public static int espacioH; // espacio total de hangares

	// NAVES en el orden en el que llegan
	public static int N[] = new int[200];
	public static int espacioN; // espacio total de naves

	// Inserta hangar de tama�o x en H[] y lo mantiene ordenado
	public static void insertH(int x) {

		// Insertamos al final
		H[tamH] = x;
		tamH++;
		espacioH += x;

		// Re-ordenamos recorriendo H desde el final,
		// intercambiando con el anterior si H[i-1] < H[i]
		// Si no hay intercambio, paramos
		int foo;
		for (int i = tamH - 1; i > 0; i--) {
			if (H[i - 1] < H[i]) {
				foo = H[i];
				H[i] = H[i - 1];
				H[i - 1] = foo;
			} else
				break;
		}
	}

	// Resta x al primer hangar y lo mantiene ordenado
	public static void subtractH(int x) {

		// Restamos x a H[0]
		H[0] -= x;

		// Re-ordenamos recorriendo desde 0 hasta el final,
		// intercambiando con el siguiente si H[i] < H[i+1]
		// Si no hay intercambio, paramos
		int foo;
		for (int i = 0; i < tamH - 1; i++) {
			if (H[i] < H[i + 1]) {
				foo = H[i];
				H[i] = H[i + 1];
				H[i + 1] = foo;
			} else
				break;
		}

		// Si hangar vac�o, un hangar menos
		if (H[tamH - 1] == 0)
			tamH--;
	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int h, n;

		// Mientras no haya 0 hangares
		while ((h = scan.nextInt()) != 0) {

			// Inicializamos
			tamH = 0;
			espacioH = 0;
			espacioN = 0;
			boolean caben = true;

			// Almacenamos todos los hangares
			for (int i = 0; i < h; i++) {
				insertH(scan.nextInt());
			}

			// N� de naves
			n = scan.nextInt();

			// Almacenamos todas las naves
			for (int i = 0; i < n; i++) {
				N[i] = scan.nextInt();
				espacioN += N[i];
			}

			// Si las naves ocupan m�s que los hangares, est� claro que NO
			if (espacioN > espacioH) {
				caben = false;
			}
			// De lo contrario, procesamos las naves una a una y comprobamos si caben
			else {
				for (int i = 0; i < n; i++) {

					// Si cabe la nave, la restamos
					if (N[i] <= H[0])
						subtractH(N[i]);
					// Si no cabe, terminamos
					else {
						caben = false;
						break;
					}
				}
			}

			// Imprimimos si caben o no caben
			if (caben)
				System.out.println("SI");
			else
				System.out.println("NO");

		}

	}

}
