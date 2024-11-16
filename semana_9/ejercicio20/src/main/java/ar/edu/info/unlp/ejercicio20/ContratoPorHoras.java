package ar.edu.info.unlp.ejercicio20;

import java.time.LocalDate;

public class ContratoPorHoras extends Contrato{
    private double valorHora;
    private int horasPorMes;

    public ContratoPorHoras(LocalDate fechaInicio, LocalDate fechaFin, double valorHora, int horasPorMes){
        super(fechaInicio, fechaFin);
        this.valorHora = valorHora;
        this.horasPorMes = horasPorMes;
    }

    @Override
    public double montoBasico() {
        return this.valorHora * this.horasPorMes;
    }
}
