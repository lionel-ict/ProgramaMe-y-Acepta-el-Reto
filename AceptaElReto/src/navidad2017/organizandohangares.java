package navidad_2017;

import java.util.Scanner;

public class organizandohangares {

	// HANGARES: Vector que hay que mantener ordenado de mayor a menor
	public static int H[] = new int[10];
	public static int tamH;

	// Inserta hangar de tamaño x en H[] y lo mantiene ordenado
	public static void insertH(int x) {

		// Insertamos al final
		H[tamH] = x;
		tamH++;

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

		// Si hangar vacío, un hangar menos
		if (H[tamH - 1] == 0)
			tamH--;
	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int h, n;

		// Mientras no haya 0 hangares
		while ((h = scan.nextInt()) != 0) {

			// Empezamos con H vacío
			tamH = 0;

			// Almacenamos tamaño de los hangares
			for (int i = 0; i < h; i++) {
				insertH(scan.nextInt());
			}

			// Nº de naves
			n = scan.nextInt();

			// Asumimos que caben
			boolean caben = true;

			// Procesamos las naves
			while (n>0) {

				// Tamaño de la nave
				int nave = scan.nextInt();
				
				// Si cabe la nave, la restamos
				if (nave <= H[0])
					subtractH(nave);
				// Si no cabe, terminamos
				else {
					scan.nextLine();
					caben = false;
					break;
				}
				
				n--;
			}

			// Imprimimos si caben o no caben
			if (caben)
				System.out.println("SI");
			else
				System.out.println("NO");

		}

	}

}
