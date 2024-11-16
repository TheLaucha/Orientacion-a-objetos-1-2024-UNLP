package ar.edu.info.unlp.ejercicio24;

import java.time.LocalDate;

public class Pasajero extends Usuario{


    public Pasajero(String nombre, double saldo) {
        super(nombre, saldo);
    }

    @Override
    public double calcularBonificacion() {
        return 0;
    }

    @Override
    public void cargarSaldo(double monto) {
        LocalDate fechaActual = LocalDate.now();
        LocalDate fechaLimite = fechaActual.minusDays(30);
        boolean tieneViajeReciente = this.getViajes().stream().anyMatch(v -> v.getFecha().isAfter(fechaLimite));
        double nuevoSaldo = this.getSaldo() + monto;

        if (!tieneViajeReciente){
            nuevoSaldo = nuevoSaldo - (nuevoSaldo * 0.10);
        }

        this.setSaldo(nuevoSaldo);
    }


}
