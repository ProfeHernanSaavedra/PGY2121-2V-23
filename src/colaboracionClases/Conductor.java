
package colaboracionClases;

/**
 *
 * @author Profe Hernan
 * @version 28-08-2023
 */
public class Conductor {
    
    private String licencia,nombre;
    private int rut,edad;
    private Auto auto;

    public Conductor() {
        
       
    }

    public Conductor(String licencia, String nombre, int rut, int edad, Auto auto) {
        this.licencia = licencia;
        this.nombre = nombre;
        this.rut = rut;
        this.edad = edad;
        this.auto = auto;
    }

   
    public String getLicencia() {
        return licencia;
    }

    public void setLicencia(String licencia) {
        this.licencia = licencia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getRut() {
        return rut;
    }

    public void setRut(int rut) {
        this.rut = rut;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Auto getAuto() {
        return auto;
    }

    public void setAuto(Auto auto) {
        this.auto = auto;
    }

    @Override
    public String toString() {
        return "Conductor{" + "licencia=" + licencia + ", nombre=" + nombre + ", rut=" + rut + ", edad=" + edad + ", auto=" + auto + '}';
    }

    
    
    
    
    
    
    
}
