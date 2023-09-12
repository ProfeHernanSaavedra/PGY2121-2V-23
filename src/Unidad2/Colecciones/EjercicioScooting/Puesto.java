/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Unidad2.Colecciones.EjercicioScooting;

/**
 *
 * @author Hernan
 */
public class Puesto {
    
    private int codigo;
    private String nombrePuesto;

    public Puesto() {
    }

    public Puesto(int codigo, String nombrePuesto) {
        this.codigo = codigo;
        this.nombrePuesto = nombrePuesto;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombrePuesto() {
        return nombrePuesto;
    }

    public void setNombrePuesto(String nombrePuesto) {
        this.nombrePuesto = nombrePuesto;
    }

    @Override
    public String toString() {
        return "Puesto{" + "codigo=" + codigo + ", nombrePuesto=" + nombrePuesto + '}';
    }
    
    
    
}
