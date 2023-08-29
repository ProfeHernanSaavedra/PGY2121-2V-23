package colaboracionClases;

/**
 *
 * @author profe Hernan
 * @version 28-08-2023
 */
public class Principal {
    
    public static void main(String[] args) {
        
        Auto autito = new Auto("AACC99", "KIA", "CERATO", 2021);
        Conductor conductor = new Conductor("B", "Juan", 123, 25, autito);
        
        System.out.println("Conductor: " + conductor.getNombre());
        System.out.println("Auto marca: " + conductor.getAuto().getMarca());
        
        
        
    }
    
}
