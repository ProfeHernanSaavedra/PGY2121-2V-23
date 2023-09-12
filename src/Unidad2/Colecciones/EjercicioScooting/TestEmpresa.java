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
public class TestEmpresa {



  /**

   * @param args the command line arguments

   */

  public static void main(String[] args) {

     

    Puesto puesto1 = new Puesto(1,"Programador Junior");

    Puesto puesto2 = new Puesto(2,"Programador Senior");

     

    Empleado empleado1 = new Empleado("1-1", "Armando Casas", 'M',5, 26, puesto1);

    Empleado empleado2 = new Empleado("2-2", "Maria Jose", 'F',10, 36, puesto2);

     

    Empresa empresa =new Empresa();

     

    if (empresa.buscarEmpleado(empleado1.getRut())== false) {

      empresa.agregar(empleado1);

      System.out.println("Se agrego : " + empleado1.getNombreEmpleado()); 

    }

    else {

        System.out.println("Empleado si existe! ");

    }
    
    
    empresa.listar();

  }

   

}
