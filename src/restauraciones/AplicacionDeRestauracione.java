
package restauraciones;

import java.util.ArrayList;

public class AplicacionDeRestauracione {
    public static void main(String[] args) {
        //Objetos de tipo escultura---------------------------
        Escultura escultura1 = new Escultura(9600,"San Salvador");
        Escultura escultura2 = new Escultura(8600,"San Salvador");
        //Objetos de tipo artista-------------------------------
        Artista artista1 = new Artista(1, "Pedro PicaPiedra");
        Artista artista2 = new Artista(2, "Pablo Marmol");
        //Objetos de tipo restauracion----------------------------
        Restauracion restauracion1 = new Restauracion("sabado", "12:40PM",escultura1,artista1);
        Restauracion restauracion2 = new Restauracion("sabado", "12:40PM",escultura1,artista1);
        Restauracion restauracion3 = new Restauracion("sabado", "12:40PM",escultura1,artista1);
       
        artista1.agregarReparaciones(restauracion1);
        artista1.agregarReparaciones(restauracion2);
        if(restauracion1.buscarArtista(1)){
            System.out.println("Artista encontrado");
            artista1.iterador();
            
        }
        else
            System.out.println("Artista no encontrado");
    }
    
}
