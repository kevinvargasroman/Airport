package pe.uni.fiis.Horarios.bean;

/**
 * Created by usuario on 05/06/2015.
 */
public class Viaje {
     private String codigoViaje;
     private String Nombre;
   //Constructor
   public Viaje(String codigoViaje, String Nombre){
       this.codigoViaje = codigoViaje;
       this.Nombre = Nombre;

   }

   //Get and Set
    public String getCodigoViaje() {
        return codigoViaje;
    }

    public void setCodigoViaje(String codigoViaje) {
        this.codigoViaje = codigoViaje;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }
}
