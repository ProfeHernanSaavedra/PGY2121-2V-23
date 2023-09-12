/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Unidad2.Colecciones.EjercicioScooting;

import java.util.ArrayList;

/**
 *
 * @author Hernan
 */
public class Empresa {
    
    private ArrayList<Empleado> listaEmpleados;

  public Empresa(){
      
    listaEmpleados = new ArrayList<>();

  }

  //Agregar

  public boolean agregar(Empleado emp){

    return listaEmpleados.add(emp);

  }

  //Buscar

  public boolean buscarEmpleado(String rut){

    for (Empleado empleado : listaEmpleados) {
      if(empleado.getRut().equals(rut)){ //empleado.gerRut() != rut (NO SE USA) --> !empleado.gerRut().equals(rut) --> distinto
        return true;
      }
    }
    return false;

  }

  //Listar
  public void listar(){

       for (Empleado emple : listaEmpleados) {

           System.out.println(emple);

       }

   }
  
  //eliminar
  public void eliminarEmpleado(String rut)
  {
      for (Empleado emplea : listaEmpleados) {
          if (buscarEmpleado(rut)) {
              listaEmpleados.remove(emplea);
              System.out.println("Empleado Eliminado!");
          }
          else{
              System.out.println("Empleado no existe");
          }
      }
  }
  
  
  

   
    
}
