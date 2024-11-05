package ar.edu.info.unlp.ejercicio18;

public class Flexible implements Politica{

    @Override
    public double reembolsar(Reserva reserva) {
        return reserva.getPrecio();
    }
}
