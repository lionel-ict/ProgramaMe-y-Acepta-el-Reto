package reto12uvas2017;

import java.util.Scanner;

public class A_racimosdeuvas {
	
	public static void main (String args[]) {
		
		Scanner scan = new Scanner(System.in);
		
		int uvas;
		int niv;
		
		while ((uvas = scan.nextInt()) != 0) {
			
			niv = 0;
			
			while (uvas > 0) {
				niv ++;
				uvas = uvas - niv;
			}
			System.out.println(niv);
		}
	}
}
