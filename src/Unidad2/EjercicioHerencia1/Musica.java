
package Unidad2.EjercicioHerencia1;

/**
 *
 * @author 
 */
public class Musica extends Interes implements IAlmacenar{
    
    private String tipoMusica;

    public Musica() {
        super();
    }

    public Musica(String tipoMusica, String usuario, String password, int tiempoConectado, int likes) {
        super(usuario, password, tiempoConectado, likes);
        this.tipoMusica = tipoMusica;
    }

    public String getTipoMusica() {
        return tipoMusica;
    }

    public void setTipoMusica(String tipoMusica) {
        this.tipoMusica = tipoMusica;
    }

    @Override
    public String toString() {
        return "Musica{" + "tipoMusica=" + tipoMusica + '}' + " " + super.toString();
    }
    

    @Override
    public String visualizar() {
        return super.visualizar() + " " + this.getTipoMusica(); 
    }

    @Override
    public int tiempoLikes(Interes interes) {
        return interes.getLikes();
        
    }

    
    
    
}
