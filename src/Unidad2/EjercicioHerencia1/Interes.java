
package Unidad2.EjercicioHerencia1;

/**
 *
 * @author 
 */
public class Interes {
    
    protected String usuario,password;
    protected int tiempoConectado,likes;

    public Interes() {
    }

    public Interes(String usuario, String password, int tiempoConectado, int likes) {
        this.usuario = usuario;
        this.password = password;
        this.tiempoConectado = tiempoConectado;
        this.likes = likes;
    }

    

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getTiempoConectado() {
        return tiempoConectado;
    }

    public void setTiempoConectado(int tiempoConectado) {
        this.tiempoConectado = tiempoConectado;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    @Override
    public String toString() {
        return "Interes{" + "usuario=" + usuario + ", password=" + password + ", tiempoConectado=" + tiempoConectado + ", likes=" + likes + '}';
    }

    
    
    public String visualizar()
    {
        return this.getUsuario();
    }
    
}
