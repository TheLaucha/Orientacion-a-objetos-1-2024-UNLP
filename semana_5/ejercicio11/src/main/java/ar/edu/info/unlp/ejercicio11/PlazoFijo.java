package ar.edu.info.unlp.ejercicio11;


import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class PlazoFijo implements Inversion{
    private LocalDate fechaDeConstitucion;
    private double montoDepositado;
    private double porcentajeDeInteresDiario;

    public PlazoFijo(double montoDepositado, double porcentajeDeInteresDiario){
        this.fechaDeConstitucion = LocalDate.of(2024,9,20);
        this.montoDepositado = montoDepositado;
        this.porcentajeDeInteresDiario = porcentajeDeInteresDiario;
    }

    public LocalDate getFechaDeConstitucion(){
        return this.fechaDeConstitucion;
    }

    public double getMontoDepositado(){
        return this.montoDepositado;
    }

    public double getPorcentajeDeInteresDiario(){
        return this.porcentajeDeInteresDiario;
    }

    @Override
    public double obtenerValorActual() {
        int diasQuePasaron = ((int)ChronoUnit.DAYS.between(this.fechaDeConstitucion, LocalDate.now()));
        double porcentajeTotal = this.porcentajeDeInteresDiario * diasQuePasaron;
        return this.montoDepositado + (porcentajeTotal/100 * this.montoDepositado);
    }
}
