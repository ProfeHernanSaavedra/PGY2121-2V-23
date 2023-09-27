
package Unidad2.EjercicioHerencia1;

/**
 *
 * @author
 */
public class Principal {
    
    public static void main(String[] args) {
        
        Musica mus = new Musica("ROCK", "admin", "admin", 120, 5);
        Television tv = new Television("Suspenso","adm", "123", 150, 80); 
        RedSocial rs = new RedSocial("Instagram", "admin","admin123", 250, 30);
        
        Coleccion col = new Coleccion();
        
        col.almacenarInteres(mus);
        col.almacenarInteres(tv);
        col.almacenarInteres(rs);
        
        col.listarIntereses();
        col.interesMasUsado();
        
        
    }
    
}
