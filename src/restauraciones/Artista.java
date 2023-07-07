
package restauraciones;

import java.sql.DriverManager;
import java.util.HashSet;
import java.util.Iterator;

public class Artista {
    private int numero;
    private String nombre;
    Restauracion restauracion;
    HashSet<Restauracion> restauracions;
    public void crear(int numero, String nombre){
        this.numero=numero;
        this.nombre=nombre;
    }

    public Artista(int numero, String nombre) {
        this.numero = numero;
        this.nombre = nombre;
    }
    public void relacionarRest(Restauracion restauracion){
        this.restauracion=restauracion;
    }
    
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void agregarReparaciones(Restauracion restauracion){
        restauracions=new HashSet<>();
        restauracions.add(restauracion);
    }
    public void iterador(){
        Iterator itr = restauracions.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
    @Override
    public String toString() {
        return "** Artista **\n " + "numero = " + numero + " --> nombre=" + nombre;
    }
    

    
}
