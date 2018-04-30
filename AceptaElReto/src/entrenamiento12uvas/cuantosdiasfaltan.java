package entrenamiento12uvas;

import java.util.Scanner;

public class cuantosdiasfaltan {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int casos = scan.nextInt();
		int diasmes[] = new int[] { 0, 31, 59, 90, 120, 151, 181, 212, 243, 273, 304, 334 };

		while (casos > 0) {

			int dia = scan.nextInt();
			int mes = scan.nextInt();
			int dias = 365 - diasmes[mes - 1] - dia;
			System.out.println(dias);
			casos--;
		}

	}

}
