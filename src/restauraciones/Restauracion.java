
package restauraciones;

public class Restauracion {
    private String fecha;
    private String hora;
    Artista artista;
    Escultura escultura;
    //---------Crea el objeto------
    public Restauracion (){
        
    }
    public Restauracion(String fecha, String hora,Escultura escultura,Artista artista) {
        this.fecha = fecha;
        this.hora = hora;
        this.escultura=escultura;
        this.artista=artista;
        this.escultura.relacionarRestauracion(this);
        this.artista.relacionarRest(this);
    }
    
    //--------Metodo para buscar al artista---------
    public boolean buscarArtista(int numero){
        if(numero==artista.getNumero()){
            return true;
        }
        return false;
    }
    public String getUbicacionEscultura(){
        return escultura.toString();
    }

    @Override
    public String toString() {
        return "** Restauracion **\n" + "fecha = " + fecha + " --> hora=" + hora + " \n" + artista + "\n"+ escultura;
    }
    
}
