
package colaboracionClases;

/**
 *
 * @author Profe Hernan
 * @version 28-08-2023
 */
public class Auto {
    
    private String patente,marca,modelo;
    private int año;

    public Auto() {
    }

    public Auto(String patente, String marca, String modelo, int año) {
        this.patente = patente;
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    @Override
    public String toString() {
        return "Auto{" + "patente=" + patente + ", marca=" + marca + ", modelo=" + modelo + ", a\u00f1o=" + año + '}';
    }
    
    
    
    
}
