package ejemplocondiciones;

import java.util.Scanner;

/**
 *
 * @author Profe Hernan
 * @version 28-08-2023
 */
public class Ciclo {

    private Scanner leer;
    private int opcion;

    public Ciclo() {
        leer = new Scanner(System.in);
    }

    public void mientras(int opcion) {
        //mientras
        //wh + tab

        while (opcion != 3) {
            System.out.println("1. Opcion 1");
            System.out.println("2. Opcion 2");
            System.out.println("3. Salir");
            System.out.println("Seleccione opcion: ");
            opcion = leer.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Hace la Opcion 1");
                    break;
                case 2:
                    System.out.println("Hace la Opcion 2");
                    break;
            }
        }
        System.out.println("Fin");

    }

    public void repetir() {
        //do + tab
        do {
            System.out.println("1. Opcion 1");
            System.out.println("2. Opcion 2");
            System.out.println("3. Salir");
            System.out.println("Seleccione opcion: ");
            opcion = leer.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Hace la Opcion 1");
                    break;
                case 2:
                    System.out.println("Hace la Opcion 2");
                    break;

            }

        } while (opcion != 3);
    }

    public void para(int fin) {
        //for + tab
        for (int i = 0; i < fin; i++) {
            System.out.println("Hola");
        }

    }
}
