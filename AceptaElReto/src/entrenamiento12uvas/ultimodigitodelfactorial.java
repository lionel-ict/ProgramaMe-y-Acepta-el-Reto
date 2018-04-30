package entrenamiento12uvas;

import java.util.Scanner;

public class ultimodigitodelfactorial {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int casos = scan.nextInt();

		while (casos > 0) {

			int num = scan.nextInt();

			if (num >= 5)
				System.out.println("0");
			else if (num == 4)
				System.out.println("4");
			else if (num == 3)
				System.out.println("6");
			else if (num == 2)
				System.out.println("2");
			else if (num <= 1)
				System.out.println("1");

			// while (num >= 2) {
			// res *= num;
			// num--;
			// }
			// System.out.println(res);
			casos--;
		}

	}

}
