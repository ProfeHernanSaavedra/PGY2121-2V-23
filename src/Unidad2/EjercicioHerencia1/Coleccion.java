
package Unidad2.EjercicioHerencia1;

import java.util.ArrayList;

/**
 *
 * @author 
 */
public class Coleccion {
    
    private ArrayList<Interes>listaIntereses;

    public Coleccion() {
        listaIntereses = new ArrayList<>();
    }
    
    public boolean almacenarInteres(Interes interes)
    {
        return listaIntereses.add(interes);
    }
    
    public void listarIntereses()
    {
        for (Interes interes : listaIntereses) {
            System.out.println(interes.toString());
        }
    }
    
    public void interesMasUsado()
    {
        int mayor = 0;
        String nombreMayor = "";
        for (Interes interes : listaIntereses) {
            
            if (interes.getLikes()> mayor) {
                mayor = interes.getLikes();
                nombreMayor = interes.getClass().getName();
            }
            
            
        }
        System.out.println("El mayor de likes: " + nombreMayor);
        
    }
    
}
