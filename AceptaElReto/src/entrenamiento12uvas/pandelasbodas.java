package entrenamiento12uvas;

import java.util.Scanner;

public class pandelasbodas {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int asientos;

		// Mientras haya casos de prueba
		while ((asientos = scan.nextInt()) != 0) {

			String config = scan.nextLine();
			// System.out.println("Config:" + asientos + "/" + config);
			
			boolean hasI = false;
			boolean hasD = false;
			boolean comen = true;
			for (int i = 1; i < config.length(); i++) {
				char c = config.charAt(i);
				if (!hasI && !hasD && (c=='I')) {
					hasI = true;
				}
				else if (!hasI && !hasD && (c=='D')) {
					hasD = true;
				}
				else if (hasI && (c=='D')) {
					comen = false;
					break;
				}
				else if (hasD && (c=='I')) {
					comen = false;
					break;
				}	
			}
			
			if (comen)
				System.out.println("TODOS COMEN");
			else
				System.out.println("ALGUNO NO COME");
		}
	}
}
