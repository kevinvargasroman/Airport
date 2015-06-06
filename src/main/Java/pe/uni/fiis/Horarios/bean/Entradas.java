package pe.uni.fiis.Horarios.bean;

import java.util.Date;

/**
 * Created by usuario on 05/06/2015.
 */
public class Entradas extends Viaje{
    private Date Llegada;
    private String LugarOrigen;
    //Constructor
    public Entradas(String codigoViaje,String Nombre,Date Llegada, String LugarOrigen ){
        super(codigoViaje,Nombre);
        this.Llegada = Llegada;
        this.LugarOrigen = LugarOrigen;
    }

    //Get and Set
    public Date getLlegada() {
        return Llegada;
    }

    public void setLlegada(Date llegada) {
        Llegada = llegada;
    }

    public String getLugarOrigen() {
        return LugarOrigen;
    }

    public void setLugarOrigen(String lugarOrigen) {
        LugarOrigen = lugarOrigen;
    }
}
