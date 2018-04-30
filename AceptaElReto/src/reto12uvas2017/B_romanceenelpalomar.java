package reto12uvas2017;

import java.util.Scanner;

public class B_romanceenelpalomar {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int casos = scan.nextInt();

		while (casos > 0) {

			int palomas = scan.nextInt();
			int cajas = scan.nextInt();

			if (palomas > cajas)
				System.out.println("PRINCIPIO");
			else
				System.out.println("ROMANCE");
		
			casos--;
		}
	}
}
