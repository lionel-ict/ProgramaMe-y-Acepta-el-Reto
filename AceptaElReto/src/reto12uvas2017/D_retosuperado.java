package reto12uvas2017;

import java.util.Scanner;

public class D_retosuperado {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		while (scan.hasNext()) {

			double grosor = ((double) scan.nextInt()) / 1000000.0;
			double edificio = (double) scan.nextInt();
			
			int doblar = 0;
			double altura = grosor;
			
			while (altura <= edificio) {
				doblar++;
				altura *= 2;
				//altura += (grosor * doblar);
				//grosor *= 2;
			}
			
			System.out.println(doblar);
		}
	}
}
