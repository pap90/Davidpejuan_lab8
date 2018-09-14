
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
public class actividades {

    private String nombre;
    private int iniciotemp;
    private int finaltemp;
    private int duracion;
    private int retraso;
    private ArrayList<actividades> predecesoras = new ArrayList();
    private ArrayList<actividades> sucesoras = new ArrayList();

    public actividades() {
    }

    public actividades(String nombre, int iniciotemp, int finaltemp, int duracion, int retraso) {
        this.nombre = nombre;
        this.duracion = duracion;
        this.retraso = retraso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getIniciotemp() {
        return iniciotemp;
    }

    public void setIniciotemp(int iniciotemp) {
        this.iniciotemp = iniciotemp;
    }

    public int getFinaltemp() {
        return finaltemp;
    }

    public void setFinaltemp(int finaltemp) {
        this.finaltemp = finaltemp;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public int getRetraso() {
        return retraso;
    }

    public void setRetraso(int retraso) {
        this.retraso = retraso;
    }

    public ArrayList<actividades> getPredecesoras() {
        return predecesoras;
    }

    public void setPredecesoras(ArrayList<actividades> predecesoras) {
        this.predecesoras = predecesoras;
    }

    public ArrayList<actividades> getSucesoras() {
        return sucesoras;
    }

    public void setSucesoras(ArrayList<actividades> sucesoras) {
        this.sucesoras = sucesoras;
    }

}
