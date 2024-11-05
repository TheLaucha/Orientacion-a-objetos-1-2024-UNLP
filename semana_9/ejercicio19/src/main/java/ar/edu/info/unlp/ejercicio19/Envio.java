package ar.edu.info.unlp.ejercicio19;

import java.time.LocalDate;

public abstract class Envio {
    private LocalDate fechaDespacho;
    private String dirOrigen;
    private String dirDestino;
    private double pesoEnGramos;

    public Envio(String dirOrigen, String dirDestino, double pesoEnGramos){
        this.fechaDespacho = LocalDate.now();
        this.dirOrigen = dirOrigen;
        this.dirDestino = dirDestino;
        this.pesoEnGramos = pesoEnGramos;
    }

    public double getPesoEnGramos(){
        return this.pesoEnGramos;
    }

    public LocalDate getFechaDespacho(){
        return this.fechaDespacho;
    }

    abstract double calcularMonto();

}
