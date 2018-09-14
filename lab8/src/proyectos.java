
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author david
 */
public class proyectos {
    private int duracion;
    private String nombre;
    private ArrayList<actividades> acti=new ArrayList();

    public proyectos() {
    }

    public proyectos(String nombre) {
        duracion = 0;
        this.nombre = nombre;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<actividades> getActi() {
        return acti;
    }

    public void setActi(ArrayList<actividades> acti) {
        this.acti = acti;
    }
    
    
}
