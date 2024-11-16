package ar.edu.info.unlp.ejercicio25;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Mascota {
    private String nombre;
    private LocalDate fnac;
    private String especie;
    private List<Servicio> servicios;

    public Mascota(String nombre, LocalDate fnac, String especie){
        this.nombre = nombre;
        this.fnac = fnac;
        this.especie = especie;
        this.servicios = new ArrayList<>();
    }

    public void agregarServicio(Servicio s){
        this.servicios.add(s);
    }

    public List<Servicio> getServicios() {
        return this.servicios;
    }

    public double calcularRecaudacion(LocalDate fecha){
        return this.getServicios()
                .stream()
                .filter(s -> s.getFechaActual().isEqual(fecha))
                .mapToDouble(ser -> ser.calcularCosto())
                .sum();
    }

}
