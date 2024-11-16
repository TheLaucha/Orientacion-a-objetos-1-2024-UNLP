package ar.edu.info.unlp.ejercicio24;

public class Vehiculo {
    private String descripcion;
    private int capacidad;
    private int anio;
    private double valor;
    private Conductor conductor;

    public Vehiculo(String desc, int capacidad, int anio, double valor, Conductor conductor){
        this.descripcion = desc;
        this.capacidad = capacidad;
        this.anio = anio;
        this.valor = valor;
        this.conductor = conductor;
    }

    public Conductor getConductor(){
        return this.conductor;
    }

    public int getAnio(){
        return this.anio;
    }

    public double getValor(){
        return this.valor;
    }
}
