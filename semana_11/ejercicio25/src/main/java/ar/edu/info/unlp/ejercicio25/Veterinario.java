package ar.edu.info.unlp.ejercicio25;

import java.time.LocalDate;

public class Veterinario {
    private String nombre;
    private LocalDate fechaIngreso;
    private double honorarios;

    public Veterinario(String nombre, LocalDate fechaIngreso, double honorarios){
        this.nombre = nombre;
        this.fechaIngreso = fechaIngreso;
        this.honorarios = honorarios;
    }

    public double getHonorarios(){
        return this.honorarios;
    }

    public LocalDate getFechaIngreso(){
        return this.fechaIngreso;
    }
}
