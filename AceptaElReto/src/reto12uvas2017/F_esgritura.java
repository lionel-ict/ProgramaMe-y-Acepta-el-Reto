package reto12uvas2017;

import java.util.Scanner;

public class F_esgritura {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		while (scan.hasNext()) {

			char[] str = scan.nextLine().toCharArray();
			int excl = 0;
			int abc = 0;

			for (int i = str.length - 1; i >= 0; i--) {
				if (str[i] == '!')
					excl++;
				else if (str[i] >= 97 && str[i] <= 122 )
					abc++;
				else if (str[i] >= 65 && str[i] <= 90 )
					abc++;
			}

			if (excl > abc)
				System.out.println("ESGRITO");
			else
				System.out.println("escrito");
		}

	}

}
