package navidad2017;

import java.util.Scanner;

public class yosoytupadre {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int casos = scan.nextInt();
		scan.nextLine();

		while (casos > 0) {

			String a = scan.nextLine();
			String b = scan.nextLine();

			if (a.equals("Luke") && b.equals("padre")) {
				System.out.println("TOP SECRET");
			} else {
				System.out.println(a + "," + " yo soy tu " + b);
			}

			casos--;
		}

	}

}
