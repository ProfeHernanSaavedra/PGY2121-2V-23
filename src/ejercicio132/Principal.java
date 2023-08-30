/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio132;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
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
                    
                    do {
                        
                        System.out.println("Ingrese correo");
                        mail = leer.next();
                        flag = valida.validarCorreo(mail);
                        if (flag == false) {
                            System.out.println("Correo no valido (largo 6)");
                        }
                        
                    } while (flag == false);
                    
                    System.out.println("Ingrese Direccion");
                    direccion = leer.next();
                    
                    //guardar datos de cliente
                    cliente.setRun(rut);
                    cliente.setDv(dv);
                    cliente.setNombre(nombre);
                    cliente.setTelefono(telefono);
                    cliente.setDireccion(direccion);
                    cliente.setMail(mail);
                    
                    System.out.println("******DATOS GUARDADOS******");
                    System.out.println(cliente);
                    
                    break;
                case 2:
                    //solicitud
                    numero = sol.obtenerNumeroSolicitud();
                    sol.setNumero(numero);
                    sol.setCliente(cliente);
                    Date fechaDate = null;
                    do {
                        
                        System.out.println("Ingrese fecha: (dd-mm-yyyy)");
                        fecha = leer.next();
                        SimpleDateFormat formato = new SimpleDateFormat("dd-MM-yyyy");
                        
                        //trycatch  + tab --> excepciones
                        try {
                            fechaDate = formato.parse(fecha);
                            flag = valida.validarFecha(fechaDate);
                            
                        } catch (ParseException e) {
                            flag = false;
                            System.out.println("Fecha invalida (dd-mm-yyyy)");
                        }
                    } while (flag == false);
                    sol.setFecha(fechaDate);
                    
                    //productos
                    System.out.println("¿Cuantos productos ingresara?");
                    totalProductos = leer.nextInt();
                    
                    
                    for (int i = 1; i <= totalProductos; i++) { // i++ => i=i+1
                        Producto prod = new Producto();
                        codigo = 0;
                        precio = 0;
                        cantidad = 0;
                        subcategoria = "";
                        descripcion = "";
                        medida = ' ';
                        
                        do {
                            System.out.println("Ingrese codigo");
                            codigo = leer.nextInt();
                            flag = valida.validarLargo4(codigo);
                            if (flag==false) {
                                System.out.println("Codigo invalido");
                            }
                        } while (flag == false);
                        
                        do {
                            System.out.println("Ingrese Precio");
                            precio = leer.nextInt();
                            flag = valida.validarNumeroPositivo(precio);
                            if (flag==false) {
                                System.out.println("Precio no valido");
                            }
                        } while (flag== false);
                        
                        do {
                            
                            System.out.println("Ingrese subcategoria (Fruta o verdura)");
                            subcategoria = leer.next();
                            flag = valida.validarSubcategoria(subcategoria);
                            if (flag == false) {
                                System.out.println("Subcategoria invalida");
                            }
                            
                        } while (flag==false);
                        
                        System.out.println("Ingrese descripcion: ");
                        descripcion = leer.next();
                        
                        System.out.println("Ingrese unidad de medida (U:unidad o G:gramos)");
                        medida = leer.next().toUpperCase().charAt(0);
                        if (medida == 'U') {
                            System.out.println("Ingrese unidades");
                            
                        }else{
                            System.out.println("Ingrese gramos");
                        }
                        cantidad = leer.nextInt();
                        
                        //guardar los datos de productos validos
                        prod.setCodigo(codigo);
                        prod.setPrecio(precio);
                        prod.setSubcategoria(subcategoria);
                        prod.setDescripcion(descripcion);
                        prod.setMedida(medida);
                        prod.setCantidad(cantidad);
                        
                        sol.agregarProductos(prod);
                        System.out.println("****AGREGAMOS SOLICITUD****");
                        System.out.println(sol);
                        
                    }
                    break;
                case 3:
                    System.out.println("Ingrese porcentaje 1-100%");
                    porcentaje = leer.nextInt();
                    descuento = sol.descontar(porcentaje);
                    System.out.println("Total: $"+ sol.getTotal());
                    System.out.println("descuento: $" + descuento);
                    System.out.println("-----------------------");
                    System.out.println("A pagar: $ "+ (sol.getTotal()-descuento));
                    
                    break;
                    
                case 4:
                    System.out.println("");
                    System.out.println("Solicitud terminada");
                    sol.verSolicitud();
                    break;
                default:
                    System.out.println("Opcion invalida");
            }
            
            
        } while (opcion != 4);
        
    }
    
}
