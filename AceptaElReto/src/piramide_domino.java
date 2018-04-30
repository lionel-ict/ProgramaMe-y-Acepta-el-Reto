
import java.util.Scanner;

public class piramide_domino {

	// SOLUCIÓN CON TIME LIMIT EXCEEDED
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int N;
		int sol;
		
		// Mientras hayan casos de prueba
		while (scan.hasNext()) {
			
			// Número a probar
			N = scan.nextInt();
			sol = 1;
			
			// Para cada valor entre 1 y N
			for (int i=1; i<=N; i++) {
				
				int fichas = 0;
				int filas = 0;
				
				// Probamos a sumar 1, 2, 3... mientras sea menor a N
				for (int j=i; fichas<N; j++) {
					fichas += j;
					filas++;
				}
				
				// Si el nº de fichas es N, hemos hayado la solución
				if (fichas == N) {
					sol = filas;
					break;
				}
			}
			
			// Mostramos la solución
			System.out.println(sol);
		}
		
	}

}
