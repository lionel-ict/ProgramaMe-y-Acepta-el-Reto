package entrenamiento12uvas;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

public class salvemoslinceiberico2 {

	public static void main(String[] args) throws IOException {

		Reader reader = new InputStreamReader(System.in);

		char c;

		// Leemos número de casos
		String Casos = "";
		while (true) {
			c = (char) reader.read();
			if (c != '\n')
				Casos = Casos + c;
			else
				break;
		}

		Casos = Casos.substring(0, Casos.length() - 1);
		int casos = Integer.parseInt(Casos);

		// System.out.println("Casos:" + Casos + " - " + casos);

		// Para cada caso
		while (casos > 0) {

			int tuneles = 0;

			while (true) {
				c = (char) reader.read();

				// Si no hay valla
				if (c == '.') {
					// Necesitamos un tunel
					tuneles++;
					// Saltamos dos tramos (comprobando si fin de linea)
					c = (char) reader.read();
					if (c == '\n')
						break;
					c = (char) reader.read();
					if (c == '\n')
						break;
				}
				// Si fin de línea, terminamos el caso
				else if (c == '\n')
					break;
			}

			System.out.println(tuneles);

			casos--;
		}

	}
}
