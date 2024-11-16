package ar.edu.info.unlp.ejercicio24;

import java.time.LocalDate;

public class Conductor extends Usuario {
    private Vehiculo vehiculo;

    public Conductor(String nombre, double saldo) {
        super(nombre, saldo);
    }

    @Override
    public double calcularBonificacion() {
        return this.vehiculo.getValor() * 0.01;
    }

    public void setVehiculo(Vehiculo vehiculo){
        this.vehiculo = vehiculo;
    }

    @Override
    public void cargarSaldo(double monto) {
        int anioVehiculo = this.vehiculo.getAnio();
        int anioActual = LocalDate.now().getYear();

        int edadVehiculo = anioActual - anioVehiculo;


        double nuevoSaldo = this.getSaldo() + monto;
        if (edadVehiculo < 5){
            nuevoSaldo = nuevoSaldo - (nuevoSaldo * 0.01);
        }else{
            nuevoSaldo = nuevoSaldo - (nuevoSaldo * 0.1);
        }

        this.setSaldo(nuevoSaldo);
    }


}
