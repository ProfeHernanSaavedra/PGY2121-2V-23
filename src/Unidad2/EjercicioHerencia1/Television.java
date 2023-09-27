
package Unidad2.EjercicioHerencia1;

/**
 *
 * @author 
 */
public class Television extends Interes implements IAlmacenar{
    
    private String genero;

    public Television() {
        super();
    }

    public Television(String genero, String usuario, String password, int tiempoConectado, int likes) {
        super(usuario, password, tiempoConectado, likes);
        this.genero = genero;
    }

  

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public String toString() {
        return "Television{" + "genero=" + genero + '}' + " "+super.toString() ;
    }
    
    @Override
    public String visualizar() {
        return super.visualizar() + " " + this.getGenero();
    }

    @Override
    public int tiempoLikes(Interes interes) {
        return interes.getLikes();
        
    }

    
}
