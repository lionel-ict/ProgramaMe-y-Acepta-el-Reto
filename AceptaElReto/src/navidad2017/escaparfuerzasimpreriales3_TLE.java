package navidad_2017;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class escaparfuerzasimpreriales3_TLE {

	public static int filas, columnas;
	public static int sx, sy, fx, fy;
	public static char mapa[][] = new char[20][20];
	public static List<int[]> lista;

	// Comprobamos si (x,y) es un posible camino
	public static final boolean posiblecamino(int x, int y) {
		if (x < 0 || y < 0 || x >= filas || y >= columnas) {
			return false;
		} else if (mapa[x][y] == '.')
			return true;
		else
			return false;
	}

	// Dime el indice del candidato mas cercano (menor distancia)
	public static final int dimemejorcandidato() {
		int dist = 1000000;
		int mejor = -1;
		for (int i = 0; i < lista.size(); i++) {
			if (lista.get(i)[0] < dist) {
				dist = lista.get(i)[0];
				mejor = i;
			}
		}
		return mejor;
	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

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

			// Marcamos S y F como camino normal
			mapa[sx][sy] = '.';
			mapa[fx][fy] = '.';

			// Creamos lista vacia
			lista = new ArrayList<int[]>();

			// Añadimos S a la lista de candidatos (inicio del camino)
			int dist = Math.abs(fx - sx) + Math.abs(fy - sy);
			lista.add(new int[] { dist, sx, sy });

			boolean haycamino = false;

			// Mientras haya elementos que comprobar en la lista
			while (lista.size() != 0) {

				// Mostramos la lista
				// System.out.println("LISTA:");
				// for (int[] i : lista) {
				// System.out.println(i[0] + "," + i[1] + "," + i[2]);
				// }

				// Buscamos el mejor candidato (menor distancia a F)
				// int c = dimemejorcandidato();
				// int[] C = lista.get(c);
				int[] C = lista.get(0);

				// Si la distancia es 0: Hemos encontrado F! Hay camino!
				if (C[0] == 0) {
					haycamino = true;
					break;
				}

				// Añadimos los vecinos a la lista (si son posible camino)
				int Cx = C[1];
				int Cy = C[2];
				// Vecino Derecha
				if (posiblecamino(Cx + 1, Cy)) {
					dist = Math.abs(fx - (Cx + 1)) + Math.abs(fy - Cy);
					lista.add(new int[] { dist, Cx + 1, Cy });
				}
				// Vecino Izquierda
				if (posiblecamino(Cx - 1, Cy)) {
					dist = Math.abs(fx - (Cx - 1)) + Math.abs(fy - Cy);
					lista.add(new int[] { dist, Cx - 1, Cy });
				}
				// Vecino Arriba
				if (posiblecamino(Cx, Cy - 1)) {
					dist = Math.abs(fx - Cx) + Math.abs(fy - (Cy - 1));
					lista.add(new int[] { dist, Cx, Cy - 1 });
				}
				// Vecino Abajo
				if (posiblecamino(Cx, Cy + 1)) {
					dist = Math.abs(fx - Cx) + Math.abs(fy - (Cy + 1));
					lista.add(new int[] { dist, Cx, Cy + 1 });
				}

				// Marcamos candidato actual como '*' y lo quitamos de la lista
				mapa[Cx][Cy] = '*';
				lista.remove(0);

				// Ordenamos la lista
				Collections.sort(lista, new Comparator<int[]>() {
					public int compare(int[] int1, int[] int2) {
						return int1[0] - int2[0];
					}
				});

			}

			// Si lista vacia, no hay camino
			if (haycamino)
				System.out.println("SI");
			else
				System.out.println("NO");

			// Comprobamos si hay camino desde S hasta F
			// if (camino(mapa, sx, sy))
			// System.out.println("SI");
			// else
			// System.out.println("NO");

		}

	}

}
