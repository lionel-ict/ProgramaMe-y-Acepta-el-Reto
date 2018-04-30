package reto12uvas2017;

import java.util.Scanner;

public class C_elpijote {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		while (scan.hasNext()) {

			char N[] = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
			String str = scan.nextLine();

			for (int i = 0; i < str.length(); i++) {
				int x = str.charAt(i) - 48;
				N[x]++;
			}

			if (N[0] == N[1] && N[1] == N[2] && N[2] == N[3] && N[3] == N[4] && N[4] == N[5] && N[5] == N[6]
					&& N[6] == N[7] && N[7] == N[8] && N[8] == N[9])
				System.out.println("subnormal");
			else
				System.out.println("no subnormal");
		}
	}

}
