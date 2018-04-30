package entrenamiento12uvas;

import java.util.Scanner;

public class campodeminas2 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		char[][] mapa;

		while (true) {

			// Procesamos ancho y alto
			int ancho = scan.nextInt();
			int alto = scan.nextInt();
			scan.nextLine();

			// Si ancho o alto es cero, paramos
			if (ancho == 0 || alto == 0)
				break;

			// Si ancho o alto menor de 3, saltamos este caso
			if (ancho < 3 || alto < 3) {
				System.out.println("0");
				continue;
			}
			
			// Mapa
			mapa = new char[alto][];
			
			// Procesamos todas las líneas del mapa
			for (int i = 0; i < alto; i++)
				mapa[i] = scan.nextLine().toCharArray();
			
			int cuantos = 0;
			int foo;
			
			// Recorremos mapa
			for (int i = 1; i < alto - 1; i++) {
				for (int j = 1; j < ancho - 1; j++) {
					// Si celda vacía
					if (mapa[i][j] == '-') {
						foo = 0;
						if (mapa[i-1][j-1] == '*')
							foo++;
						if (mapa[i-1][j] == '*')
							foo++;
						if (mapa[i-1][j+1] == '*')
							foo++;
						if (mapa[i][j-1] == '*')
							foo++;
						if (mapa[i][j+1] == '*')
							foo++;
						if (mapa[i+1][j-1] == '*')
							foo++;
						if (mapa[i+1][j] == '*')
							foo++;
						if (mapa[i+1][j+1] == '*')
							foo++;
						if (foo > 5)
							cuantos++;
					}
				}
			}
			
			System.out.println(cuantos);
		}

		scan.close();
	}

}
