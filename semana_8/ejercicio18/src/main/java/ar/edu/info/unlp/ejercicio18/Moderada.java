package ar.edu.info.unlp.ejercicio18;

import java.time.LocalDate;

public class Moderada implements Politica{
    @Override
    public double reembolsar(Reserva reserva) {
        LocalDate from = reserva.getPeriodo().getFrom();
        LocalDate today = LocalDate.now();
        DateLapse periodo = new DateLapse(from, today);
        int diasEntre = periodo.sizeInDays();

        double precioReserva = reserva.getPrecio();
        if (diasEntre > 7){
            return precioReserva;
        }else if (diasEntre > 2){
            return precioReserva * 0.5;
        }else {
            return 0;
        }
    }
}
