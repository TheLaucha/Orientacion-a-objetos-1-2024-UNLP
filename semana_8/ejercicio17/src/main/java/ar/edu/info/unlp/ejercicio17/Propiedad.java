package ar.edu.info.unlp.ejercicio17;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Propiedad {
    private String direccion;
    private String nombre;
    private double precio;
    List<Reserva> reservas;

    public Propiedad(String direccion, String nombre, double precio){
        this.direccion = direccion;
        this.nombre = nombre;
        this.precio = precio;
        this.reservas = new ArrayList<Reserva>();
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

    public void cancelarReserva(LocalDate desde, LocalDate hasta){
        DateLapse periodo = new DateLapse(desde, hasta);
        LocalDate today = LocalDate.now();

        Reserva reservaParaCancelar = this.reservas.stream()
                .filter(r -> r.getPeriodo().equals(periodo) && !r.getPeriodo().includesDate(today))
                .findFirst()
                .orElse(null);

        if (reservaParaCancelar != null){
            this.reservas.remove(reservaParaCancelar);
        }else {
            System.out.println("No existe reserva en ese periodo o ya esta en curso");
        }
    }
}
