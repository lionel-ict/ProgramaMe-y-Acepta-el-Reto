package navidad2017;

import java.util.Scanner;

public class tendendiaalladooscuro {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int[] B5 = new int[13];
		B5[0] = 1;
		B5[1] = 5;
		B5[2] = 25;
		B5[3] = 125;
		B5[4] = 625;
		B5[5] = 3125;
		B5[6] = 15625;
		B5[7] = 78125;
		B5[8] = 390625;
		B5[9] = 1953125;
		B5[10] = 9765625;
		B5[11] = 48828125;
		B5[12] = 244140625;

		/*
		 * int b = 1; int c = 0; while (b <= 1000000000) { System.out.println(c + ": " +
		 * b); c++; b *= 5; }
		 */

		int casos = scan.nextInt();
		scan.nextLine();

		while (casos > 0) {

			String s5 = "";

			int i10 = scan.nextInt();
			int cuantos = 0;
			for (int i = 12; i >= 0; i--) {
				int x = i10 / B5[i];
				s5 += x;
				i10 -= (B5[i] * x);
				if (x == 4)
					cuantos++;
				if (cuantos >= 2)
					break;
			}

			// System.out.println(s5);

			if (cuantos >= 2)
				System.out.println("SI");
			else
				System.out.println("NO");

			casos--;
		}
		
		scan.close();

	}

}
