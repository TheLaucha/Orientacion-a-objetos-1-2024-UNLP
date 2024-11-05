package ar.edu.info.unlp.ejercicio17;

import java.time.LocalDate;

public class Reserva {
    private double precio;
    private Usuario usuario;
    private DateLapse periodo;

    public Reserva(double precio, Usuario usuario, DateLapse periodo){
        this.precio = precio;
        this.usuario = usuario;
        this.periodo = periodo;
    }

    public double getPrecio() {
        return precio;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public DateLapse getPeriodo(){
        return periodo;
    }

    public double calcularPrecio(){
        return this.periodo.sizeInDays() * this.precio;
    }

}
