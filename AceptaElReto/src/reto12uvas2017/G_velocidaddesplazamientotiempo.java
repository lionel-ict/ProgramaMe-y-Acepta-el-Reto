package reto12uvas2017;

import java.util.Scanner;

public class G_velocidaddesplazamientotiempo {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int casos = scan.nextInt();
		scan.nextLine();
		
		while (casos > 0 ) {
			
			int V=0, D=0, T=0;
			boolean hasV = false, hasD = false, hasT = false;
			
			String str[] = scan.nextLine().split(" ");
			for (String s : str) {
				if (s.charAt(0) == 'V') {
					hasV = true;
					s = s.replaceFirst("V=", "");
					V = Integer.parseInt(s);
				}
				else if (s.charAt(0) == 'D') {
					hasV = true;
					s = s.replaceFirst("D=", "");
					D = Integer.parseInt(s);
				}
				else if (s.charAt(0) == 'T') {
					hasT = true;
					s = s.replaceFirst("T=", "");
					T = Integer.parseInt(s);
				}
			}
			
			if (hasD && hasT) {
				V = D/T;
				System.out.println("V=" + V);
			}
			else if (hasV && hasT) {
				D = V * T;
				System.out.println("D=" + D);
			}
			else if (hasV && hasD) {
				T = D/V;
				System.out.println("T=" + T);
			}
			
			casos--;
		}
		
	}

}
