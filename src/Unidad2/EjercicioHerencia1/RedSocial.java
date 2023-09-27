
package Unidad2.EjercicioHerencia1;

/**
 *
 * @author 
 */
public class RedSocial extends Interes implements IAlmacenar{
    
    private String nombreRS;

    public RedSocial() {
        super();
    }

    public RedSocial(String nombreRS, String usuario, String password, int tiempoConectado, int likes) {
        super(usuario, password, tiempoConectado, likes);
        this.nombreRS = nombreRS;
    }

  

    public String getNombreRS() {
        return nombreRS;
    }

    public void setNombreRS(String nombreRS) {
        this.nombreRS = nombreRS;
    }

    @Override
    public String toString() {
        return "RedSocial{" + "nombreRS=" + nombreRS + '}' + " " + super.toString();
    }
    
    @Override
    public String visualizar() {
        return super.visualizar() + " " + this.getNombreRS();
    }

    @Override
    public int tiempoLikes(Interes interes) {
        return interes.getLikes();
        
    }

    
}
