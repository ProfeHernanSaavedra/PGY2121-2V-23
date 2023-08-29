package ejemplocondiciones;

import java.util.Scanner;



/**
 *
 * @author Profe Hernán
 * @version 28-08-2023
 */
public class Condicion {
    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in); //input en python
        
        int dia = 0;
        System.out.println("Ingrese dia: ");
        dia = leer.nextInt();
        
        //sw+ tab
        switch (dia) {
            case 1:
                System.out.println("Lunes");
                break;
            case 3:
                System.out.println("Miercoles");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            case 7:
                System.out.println("Domingo");
                break;
            default:
                System.out.println("No hay opcion");
        }
        
        
    }
    
}
