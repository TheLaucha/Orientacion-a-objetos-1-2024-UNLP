package ar.edu.info.unlp.ejercicio18;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Propiedad {
    private String direccion;
    private String nombre;
    private double precio;
    List<Reserva> reservas;
    Politica politica;

    public Propiedad(String direccion, String nombre, double precio, Politica politica){
        this.direccion = direccion;
        this.nombre = nombre;
        this.precio = precio;
        this.reservas = new ArrayList<Reserva>();
        this.politica = politica;
    }

    /*
        Retorna true si esta ocupado,
        quiere decir que el periodo se superpone con otro ya existente.
     */
    public boolean consultarDisponibilidad(DateLapse periodo){
        return reservas.stream().anyMatch(r -> r.getPeriodo().overlaps(periodo));
    }

    public boolean crearReserva(LocalDate desde, LocalDate hasta, Usuario usuario){
        DateLapse periodo = new DateLapse(desde, hasta);
        boolean estaOcupado = consultarDisponibilidad(periodo);
        if (!estaOcupado){
            Reserva reserva = new Reserva(this.precio, usuario, periodo);
            this.reservas.add(reserva);
            return true;
        }else{
            return false;
        }
    }

    public void cancelarReserva(Reserva r){
        LocalDate today = LocalDate.now();

        boolean estaEnCurso = r.getPeriodo().includesDate(today);
        boolean existe = this.reservas.contains(r);

        if (!estaEnCurso && existe){
            this.reservas.remove(r);
            this.reembolsar(r);
        }else {
            System.out.println("La reserva esta en curso o no existe");
        }
    }

    private double reembolsar(Reserva reserva){
        double montoAReembolsar = politica.reembolsar(reserva);
        return montoAReembolsar;
    }
}
