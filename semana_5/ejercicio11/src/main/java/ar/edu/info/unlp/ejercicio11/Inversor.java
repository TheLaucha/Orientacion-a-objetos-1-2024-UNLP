package ar.edu.info.unlp.ejercicio11;

import java.util.ArrayList;
import java.util.List;

public class Inversor {
    private String nombre;
    private List<Inversion> inversiones;

    public Inversor(String nombre){
        this.nombre = nombre;
        this.inversiones = new ArrayList<Inversion>();
    }

    public void agregarInversion(Inversion inversion){
        inversiones.add(inversion);
    }

    public List<Inversion> getInversiones(){
        return this.inversiones;
    }

    public double valorActual(){
        return inversiones.stream().mapToDouble(i -> i.obtenerValorActual()).sum();
    }

}
