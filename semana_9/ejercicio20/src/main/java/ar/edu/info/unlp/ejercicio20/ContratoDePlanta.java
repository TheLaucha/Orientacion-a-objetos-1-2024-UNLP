package ar.edu.info.unlp.ejercicio20;

import java.time.LocalDate;

public class ContratoDePlanta extends Contrato{
    private double sueldoMensual;
    private double montoConyuge;
    private double montoHijos;

    public ContratoDePlanta (LocalDate fechaInicio, LocalDate fechaFin, double sueldoMensual, double montoConyuge, double montoHijos){
        super(fechaInicio, fechaFin);
        this.sueldoMensual = sueldoMensual;
        this.montoConyuge = montoConyuge;
        this.montoHijos = montoHijos;
    }


    // ?? Deberia verificar de alguna forma si hay conyuge o hijos ?
    // Yo asumi que si NO hay el monto es 0.
    @Override
    public double montoBasico() {
        return this.sueldoMensual + this.montoConyuge + this.montoHijos;
    }
}
