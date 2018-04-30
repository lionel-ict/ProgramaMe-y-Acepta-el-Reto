package entrenamiento12uvas;

import java.util.Scanner;

public class mejorimposible {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int tamacera;

		// Mientras haya casos de prueba
		while ((tamacera = scan.nextInt()) != 0) {

			// Coordenadas iniciales
			int x1 = scan.nextInt();
			int y1 = scan.nextInt();

			// Coordenadas finales
			int x2 = scan.nextInt();
			int y2 = scan.nextInt();

			// Calculamos las distancias en X y en Y
			int distX = Math.abs(x2 - x1);
			int distY = Math.abs(y2 - y1);

			// Comprobamos si es posible: Las distancias
			// deben ser par/par o impar/impar, es decir,
			// si la suma de distancias es impar: no se puede
			if (((distX + distY) % 2) == 1) {
				System.out.println("IMPOSIBLE");
			}
			// En otro caso, sí es posible
			else {
				if (distX == 0 && distY == 0)
					System.out.println("0");
				// Si las distancias en X e Y son iguales: 1 paso
				else if (distX == distY)
					System.out.println("1");
				// Si son distintas: 2 pasos
				else
					System.out.println("2");
			}
		}
	}
}
