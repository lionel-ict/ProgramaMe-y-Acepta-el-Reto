package reto12uvas2017;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class E_anunciomascaro {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws Exception {

		Scanner scan = new Scanner(System.in);
		int casos = scan.nextInt();
		scan.nextLine();

		SimpleDateFormat format = new SimpleDateFormat("HH:mm:ss");
		// Date date1 = format.parse("00:00:00");

		while (casos > 0) {

			int campanadas = 24 * 60 * 60;

			String str = scan.nextLine();
			Date time = format.parse(str);

			int anuncio = time.getHours() * 60 * 60 + time.getMinutes() * 60 + time.getSeconds();

			int diff = campanadas - anuncio;

			int h = diff / (60 * 60);
			diff -= (h * 60 * 60);
			int m = diff / 60;
			diff -= (m * 60);
			int s = diff;

			Date time2 = new Date(0, 0, 0, h, m, s);

			System.out.println(format.format(time2));

			casos--;
		}

	}

}
