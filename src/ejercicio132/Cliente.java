
package ejercicio132;

/**
 *
 * @author Profe Hernan
 * @version 28-08-2023
 */
public class Cliente {
    
    private int run,telefono;
    private char dv;
    private String nombre,mail,direccion;

    public Cliente() {
    }

    public Cliente(int run, int telefono, char dv, String nombre, String mail, String direccion) {
        this.run = run;
        this.telefono = telefono;
        this.dv = dv;
        this.nombre = nombre;
        this.mail = mail;
        this.direccion = direccion;
    }

    public int getRun() {
        return run;
    }

    public void setRun(int run) {
        this.run = run;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public char getDv() {
        return dv;
    }

    public void setDv(char dv) {
        this.dv = dv;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "Cliente{" + "run=" + run + ", telefono=" + telefono + ", dv=" + dv + ", nombre=" + nombre + ", mail=" + mail + ", direccion=" + direccion + '}';
    }
    
    
    
    
    
}
