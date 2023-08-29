/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio132;

import java.util.Scanner;



/**
 *
 * @author USRVI-LC3
 */
public class Principal {
    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        int opcion;
        boolean flag; //validaciones
        //cliente
        //captura de datos
        int rut,telefono;
        String nombre,mail,direccion;
        char dv;
        //producto
        int codigo,precio,cantidad,totalProductos;
        String subcategoria,descripcion;
        char medida;
        //solicitud
        int numero;
        String fecha;
        int porcentaje;
        int descuento;
        
        Valida valida = new Valida();
        Cliente cliente = new Cliente();
        Solicitud sol = new Solicitud();
        
        do {
            System.out.println("*****MENU*****");
            System.out.println("1. Ingresar Cliente");
            System.out.println("2. Ingresar solicitud y sus productos");
            System.out.println("3. Aplicar descuento");
            System.out.println("4. Salir (Ver Solicitud");
            opcion = leer.nextInt();
            
            
            switch (opcion) {
                case 1:
                    do {
                        System.out.println("Ingrese Rut:");
                        rut = leer.nextInt();
                        System.out.println("Ingrese DV: ");
                        dv = leer.next().charAt(0);
                        flag = valida.validarRut(rut, dv);
                        if (flag==false) {
                            System.out.println("Rut no valido");
                        }
                    } while (flag == false);
                    
                    System.out.println("Ingrese nombre: ");
                    nombre = leer.next();
                    
                    do {
                        System.out.println("Ingrese telefono: ");
                        telefono = leer.nextInt();
                        flag = valida.validarLargo8(telefono);
                        if (flag==false) {
                            System.out.println("Telefono malo (largo 8)");
                        }
                    } while (flag==false);
                    
                    break;
                default:
                    
            }
            
            
        } while (opcion != 4);
        
    }
    
}
