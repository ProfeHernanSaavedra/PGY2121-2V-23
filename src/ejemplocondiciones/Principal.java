/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplocondiciones;

/**
 *
 * @author USRVI-LC3
 */
public class Principal {
    
    public static void main(String[] args) {
        
        Ciclo ciclo = new Ciclo();
        System.out.println("****MIENTRAS******");
        int opcion = 0;
        ciclo.mientras(opcion);
        System.out.println("*****REPETIR******");
        ciclo.repetir();
        System.out.println("*****PARA******");
        ciclo.para(5);
        
        String nombre = "JUAN";
        
        int largo = nombre.length();
        System.out.println(largo);
        char letra = nombre.charAt(2);
        System.out.println(letra);
        
        if (nombre.equalsIgnoreCase("JuaN")) {
            System.out.println("Bien");
        }
        else
        {
            System.out.println("MAL");
        }
        
        
    }
    
}
