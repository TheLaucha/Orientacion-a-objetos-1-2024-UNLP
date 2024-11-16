package ar.edu.info.unlp.ejercicio20;

import java.time.LocalDate;
import java.time.Period;

public abstract class Contrato {
    private LocalDate fechaInicio;
    private LocalDate fechaFin;

    public Contrato(LocalDate fechaInicio, LocalDate fechaFin){
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
    }

    public LocalDate getFechaFin(){
        return this.fechaFin;
    }

    public int calcularDuracionEnAnios(){
        int duracionEnAnios = Period.between(this.fechaInicio, this.fechaFin == null ? LocalDate.now() : this.fechaFin).getYears();
        return duracionEnAnios;
    }

    public boolean estaActivo(){
        return this.fechaFin.isAfter(LocalDate.now());
    }

    abstract public double montoBasico();
}
