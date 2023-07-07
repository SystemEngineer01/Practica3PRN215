
package restauraciones;

import java.util.HashSet;

public class Escultura {
    private int codigo;
    private String ubicacion;
    Restauracion restauracion;
    
    HashSet<Restauracion> restauracions;
    public void crear(int codigo,String ubicacion){
        this.codigo=codigo;
        this.ubicacion=ubicacion;
    }
    //________________________________________________
    public Escultura(int codigo, String ubicacion) {
        this.codigo = codigo;
        this.ubicacion = ubicacion;
    }
    public void relacionarRestauracion(Restauracion restauracion){
        this.restauracion=restauracion;
    }
    @Override
    public String toString() {
        return "** Escultura ** \n" + "codigo = " + codigo + " --> ubicacion = " + ubicacion;
    }
    
    
}
