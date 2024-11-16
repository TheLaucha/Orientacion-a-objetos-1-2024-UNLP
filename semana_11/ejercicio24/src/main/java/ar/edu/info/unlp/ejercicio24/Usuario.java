package ar.edu.info.unlp.ejercicio24;

import java.util.ArrayList;
import java.util.List;

public abstract class Usuario {
    private String nombre;
    private double saldo;
    private List<Viaje> viajes;

    public Usuario(String nombre, double saldo){
        this.nombre = nombre;
        this.saldo = saldo;
        this.viajes = new ArrayList<>();
    }

    public double getSaldo(){
        return this.saldo;
    }

    public void setSaldo(double saldo){
        this.saldo = saldo;
    }

    public List<Viaje> getViajes(){
        return this.viajes;
    }

    public abstract double calcularBonificacion();

    public abstract void cargarSaldo(double monto);
}
