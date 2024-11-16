package ar.edu.info.unlp.ejercicio24;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Viaje {
    private String origen;
    private String destino;
    private double costoTotal;
    Vehiculo vehiculo;
    private LocalDate fecha;
    private List<Usuario> pasajeros;

    public Viaje(String origen, String destino, double costoTotal, Vehiculo v, LocalDate f){
        this.origen = origen;
        this.destino = destino;
        this.costoTotal = costoTotal;
        this.vehiculo = v;
        this.fecha = f;
        this.pasajeros = new ArrayList<>();
        this.pasajeros.add(v.getConductor());
    }

    public LocalDate getFecha(){
        return this.fecha;
    }


    public void registrarPasajero(Usuario pasajero){
        this.pasajeros.add(pasajero);
    }

    public void procesarViaje(){
        double aPagarCadaUno = this.costoTotal / this.pasajeros.size();
        double bonificacionPasajero =
    }
}
