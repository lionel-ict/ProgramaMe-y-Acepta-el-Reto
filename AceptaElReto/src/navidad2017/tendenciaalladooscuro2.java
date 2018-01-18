package navidad2017;

import java.util.Scanner;

public class tendenciaalladooscuro2 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        // Nº de casos
        int casos = scan.nextInt();
        scan.nextLine();

        // Para cada caso
        while (casos > 0) {

            // Leemos numero en base 10
            String linea = scan.nextLine();

            // Convertimos a base 5
            int i10 = Integer.parseInt(linea, 10);
            String s5 = Integer.toString(i10, 5);
            char[] c5 = s5.toCharArray();
            
            // Mostramos x pantalla
            //System.out.println(i10 + " => " + s5);

            // Contamos cuantos '4' contiene
            int cuantos = 0;
            for (int i = 0; i < c5.length; i++) {
                if (c5[i] == '4') {
                    cuantos++;
                }
            }

            // Mostramos resultado por pantalla
            if (cuantos >= 2) {
                System.out.println("SI");
            } else {
                System.out.println("NO");
            }

            casos--;
        }

        scan.close();

    }

}
