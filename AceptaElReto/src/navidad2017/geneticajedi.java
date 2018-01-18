package navidad_2017;

import java.util.Arrays;
import java.util.Scanner;

public class geneticajedi {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		// int F[] = new int[20];

		// Mientras haya casos de prueba
		int familias;
		while ((familias = scan.nextInt()) > 0) {

			// Vector donde guardaremos midiclorianos
			// del mejor hijo de cada familia
			int F[] = new int[familias];

			// Mientras haya familias que procesar
			for (int i = 0; i < familias; i++) {

				// Nº de hijos
				int hijos = scan.nextInt();
				// Midiclorianos que transmiten los padres
				int midic = scan.nextInt();

				// Mientras haya hijos que procesar, buscamos
				// el valor maximo (mayor influencia de la fuerza)
				int max = -1;
				while (hijos > 0) {
					int h = scan.nextInt();
					if (h > max) {
						max = h;
					}
					hijos--;
				}

				// Almacenamos midiclorianos del mejor hijo
				F[i] = midic * max;
			}

			// Ordenamos F de menor a mayor (ascendente)
			Arrays.sort(F);

			// Imprimimos F de mayor a menor valor (descendente)
			for (int i = familias - 1; i > 0; i--) {
				System.out.print(F[i] + " ");
			}
			System.out.println(F[0]);
		}

	}

}
