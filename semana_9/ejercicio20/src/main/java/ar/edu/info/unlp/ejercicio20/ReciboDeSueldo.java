package ar.edu.info.unlp.ejercicio20;

import java.time.LocalDate;

public class ReciboDeSueldo {
    private Empleado empleado;
    private int antiguedad;
    private LocalDate fechaRecibo;
    private double montoTotal;

    // ?? Es correcto que recibo de sueldo conozca empleado ? o es conveniente enviar los atributos
    // de empleado por constructor ?
    // Si tengo empleado podria conocer la antiguedad, montoTotal sin necesidad de tener atributos
    public ReciboDeSueldo(Empleado empleado, int antiguedad, double montoTotal){
        this.empleado = empleado;
        this.antiguedad = antiguedad;
        this.montoTotal = montoTotal;
        this.fechaRecibo = LocalDate.now();
    }


}
