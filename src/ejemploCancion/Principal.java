package ejemploCancion;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Profe Hernán
 * @version 21-08-2023
 */
public class Principal {

    public static void main(String[] args) {

        //crear canciones
        Cancion cancion1 = new Cancion();
        Cancion cancion2 = new Cancion("Suave", "Luis Miguel", 217, true, 'N');

        //modificar atributos de la cancion1
        cancion1.setTitulo("Creep");
        cancion1.setArtista("Radiohead");
        cancion1.setTiempoDuracion(238);
        cancion1.setDescargada('N');
        //cancion1.setFavorita(true);
        //sino se incializa favorita asume valor false

        //metodos customer que retornan
        System.out.println(cancion1.getTitulo() + " " + cancion1.adelantarCancion(10, 0) + " segundos");
        System.out.println("********************");
        System.out.println(cancion1.obtenerTipoCancion());
        System.out.println(cancion1.toString());
        System.out.println(cancion2.toString());
        //metodos customer que no retornan
        cancion1.imprimirCanciones();
        System.out.println("****************");
        cancion2.imprimirCanciones();
        cancion1.imprimirCanciones();

    }

}
