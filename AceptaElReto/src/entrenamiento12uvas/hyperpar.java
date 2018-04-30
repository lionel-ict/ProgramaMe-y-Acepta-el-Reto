package entrenamiento12uvas;

import java.util.Scanner;

public class hyperpar {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		while (true) {
			
			// Cogemos número a procesar
			String numero = scan.nextLine();
			
			// Si es negativo, terminamos
			if (numero.charAt(0) == '-')
				break;
			
			// Procesamos el número
			boolean hyperpar = true;
			for (int i=0; i<numero.length(); i++) {
				
				int n = Integer.parseInt("" + numero.charAt(i));
				if (n % 2 != 0) {
					hyperpar = false;
					break;
				}
			}
			
			if (hyperpar)
				System.out.println("SI");
			else
				System.out.println("NO");
			
		}

	}

}
