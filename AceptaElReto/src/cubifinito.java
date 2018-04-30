import java.util.ArrayList;
import java.util.Scanner;

public class cubifinito {

	// Procesa n y devuelve el siguiente paso cubifinito
	// (la suma del cubo de los dígitos que forman n)
	public static int procesaCubifinito(int n) {

		int tot = 0;
		int foo;

		while (n > 0) {
			foo = n % 10;
			tot += (foo * foo * foo);
			n = n / 10;
		}

		return tot;
	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int n, c;

		// Mientras existan casos de prueba
		while ((n = scan.nextInt()) != 0) {

			ArrayList array = new ArrayList();
			System.out.print(n);

			// Procesamos el número
			while (true) {

				// Si n es 1, SÍ ES cubifinito!
				if (n == 1) {
					System.out.println(" -> cubifinito.");
					break;
				}
				// Si n ya apareció antes, NO ES cubifinito!
				else if (array.contains(n)) {
					System.out.println(" -> no cubifinito.");
					break;
				}
				// En otro caso, seguimos
				else {
					array.add(n);
					n = procesaCubifinito(n);
					System.out.print(" - " + n);
				}
			}
		}
	}
}
