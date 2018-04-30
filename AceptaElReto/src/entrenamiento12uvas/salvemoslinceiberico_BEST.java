package entrenamiento12uvas;

import java.util.Scanner;

public class salvemoslinceiberico_BEST {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int casos = scan.nextInt();
		scan.nextLine();
		
		while(casos > 0) {
			
			String str = scan.nextLine();
			int tuneles = 0;
			for (int i=0; i<str.length(); i++) {
				
				if (str.charAt(i) == '.') {
					tuneles++;
					i += 2;
				}
					
			}
			
			System.out.println(tuneles);
			
			casos--;
		}
	}
}
