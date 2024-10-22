package ar.edu.info.unlp.ejercicio15;

import java.time.LocalDate;

public class Factura {
    private LocalDate fechaEmision;
    private double bonificacion;
    private double montoFinal;
    private Usuario usuario;

    public Factura(Usuario usuario, double bonificacion, double montoFinal){
        this.usuario = usuario;
        this.fechaEmision = LocalDate.now();
        this.bonificacion = bonificacion;
        this.montoFinal = montoFinal;
    }

    public String toSring(){
        return "Usuario: " + this.usuario.getNombre()
                + " con Domicilio: " + this.usuario.getDomicilio()
                + " Fecha de emision: " + this.fechaEmision
                + " Bonificacion: " + this.bonificacion
                + " Monto final: " + this.montoFinal;
    }
}
