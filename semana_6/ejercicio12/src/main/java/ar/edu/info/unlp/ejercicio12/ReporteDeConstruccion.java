package ar.edu.info.unlp.ejercicio12;

import java.util.ArrayList;
import java.util.List;

public class ReporteDeConstruccion {
    private List<Pieza> piezas;

    public ReporteDeConstruccion(){
        this.piezas = new ArrayList<Pieza>();
    }

    public List<Pieza> getPiezas() {
        return piezas;
    }

    public void agregarPieza(Pieza pieza){
        piezas.add(pieza);
    }

    public double getVolumenDeMaterial(String material){
        return piezas
                .stream()
                .filter(p -> p.getMaterial().equals(material))
                .mapToDouble(p -> p.getVolumen())
                .sum();
    }

    public double getSuperficieDeColor(String color){
        return piezas
                .stream()
                .filter(p -> p.getColor().equals(color))
                .mapToDouble(p -> p.getSuperficie())
                .sum();
    }
}
