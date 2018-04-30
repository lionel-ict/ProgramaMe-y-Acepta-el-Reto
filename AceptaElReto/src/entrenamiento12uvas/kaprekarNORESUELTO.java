package entrenamiento12uvas;

import java.util.Arrays;
import java.util.Scanner;

public class kaprekarNORESUELTO {

	// Reverse a String
	public static String reverse(String input) {
		char[] in = input.toCharArray();
		int begin = 0;
		int end = in.length - 1;
		char temp;
		while (end > begin) {
			temp = in[begin];
			in[begin] = in[end];
			in[end] = temp;
			end--;
			begin++;
		}
		return new String(in);
	}

	// Indica si se deben hacer más iteraciones
	public static boolean esRepdigit(String S) {

		int s = Integer.parseInt(S);

		return (s == 0 || s == 1111 || s == 2222 || s == 3333 || s == 4444 || s == 5555 || s == 6666 || s == 7777
				|| s == 8888 || s == 9999);

	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		// Leemos nº de casos
		int casos = scan.nextInt();
		scan.nextLine();

		// Mientras hayan casos
		while (casos > 0) {

			// Leemos el número
			String s = scan.nextLine();

			// Si es un 'repdigit' el caso está claro
			if (esRepdigit(s)) {
				System.out.println("8");
				casos--;
			}
			// Si no, hay que procesarlo
			else {
				// Iteraciones
				int iter = 0;

				// Mientras haya que continuar
				while (!s.equals("6174")) {

					// Número mínimo de kaprekar
					char[] Min = s.toCharArray();
					Arrays.sort(Min);
					// System.out.println(Min);

					// Número máximo de kaprekar
					// char[] Max = new
					// StringBuilder(Min.toString()).reverse().toString().toCharArray();
					char[] Max = reverse(new String(Min)).toCharArray();
					// System.out.println(Max);

					// Convertimos a int
					int min = Integer.parseInt(new String(Min));
					int max = Integer.parseInt(new String(Max));

					// Calculamos siguiente número
					int next = max - min;

					// Convertimos a String
					if (next >= 1000)
						s = "" + next;
					else if (next >= 100)
						s = "0" + next;
					else if (next >= 10)
						s = "00" + next;
					else
						s = "000" + next;

					// Actualizamos nº de iteraciones
					iter++;
				}

				// Mostramos nº de iteraciones que han sido necesarias
				System.out.println(iter);
				casos--;
			}
		}
	}
}
