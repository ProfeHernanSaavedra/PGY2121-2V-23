
package Unidad2.Colecciones;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Hernan
 */
public class EjemploColecciones {
        
    
    public static void main (String [] args)
            
    {
        ArrayList<String> listaNombres = new ArrayList<>();
        
        listaNombres.add("Juan");
        listaNombres.add("Maria");
        
        System.out.println(listaNombres);
        
        //fore+tab ---> for each
        for (String nombre : listaNombres) {
            System.out.println(nombre);
        }
        
        System.out.println("");
        System.out.println("*******EJEMPLO CON OBJETO AUTO******");
        
        ArrayList<Auto> listaAutos = new ArrayList<>();
        
        Auto auto1 = new Auto("KIA", "CERATO", 2020);
        Auto auto2 = new Auto("KIA", "RIO", 2021);
        Auto auto3 = new Auto("KIA", "MORNING", 2022);
        
        listaAutos.add(auto1);
        listaAutos.add(auto2);
        listaAutos.add(auto3);
        
        for (Auto auto : listaAutos) {
            System.out.println(auto.getModelo());
        }
        

    }
    
}
