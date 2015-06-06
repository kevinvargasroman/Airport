package pe.uni.fiis.Horarios.bean;

import java.util.Date;

/**
 * Created by usuario on 05/06/2015.
 */
public class Salidas extends Viaje{
    private Date salida;
    private String LugarDestino;

    //Constructor
    public Salidas(String codigoViaje,String Nombre,Date salida,String LugarDestino){
        super(codigoViaje,Nombre);
        this.salida = salida;
        this.LugarDestino = LugarDestino;
    }

    //Get and Set
    public Date getSalida() {
        return salida;
    }

    public void setSalida(Date salida) {
        this.salida = salida;
    }

    public String getLugarDestino() {
        return LugarDestino;
    }

    public void setLugarDestino(String lugarDestino) {
        LugarDestino = lugarDestino;
    }
}
