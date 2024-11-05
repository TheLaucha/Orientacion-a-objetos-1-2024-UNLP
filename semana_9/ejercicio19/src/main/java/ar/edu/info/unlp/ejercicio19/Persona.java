package ar.edu.info.unlp.ejercicio19;

import java.time.LocalDate;

public class Persona extends Cliente{
    private String dni;

    public Persona(String nombre, String direccion, String dni){
        super(nombre, direccion);
        this.dni = dni;
    }

    @Override
    public double calcularMonto(DateLapse periodo){
        // Al total hacerle el 10% de descuento
        double total = super.calcularMonto(periodo);
        double descuento = total * 0.1;
        return total - descuento;
    }

}
