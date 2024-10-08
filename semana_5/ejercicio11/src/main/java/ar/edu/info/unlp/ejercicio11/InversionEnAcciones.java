package ar.edu.info.unlp.ejercicio11;

public class InversionEnAcciones implements Inversion{
    private String nombre;
    private int cantidad;
    private double valorUnitario;

    public InversionEnAcciones(String nombre, int cantidad, double valorUnitario){
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.valorUnitario = valorUnitario;
    }

    public String getNombre(){
        return this.nombre;
    }

    public int getCantidad(){
        return this.cantidad;
    }

    public double getValorUnitario(){
        return this.valorUnitario;
    }

    @Override
    public double obtenerValorActual(){
        return this.cantidad * this.valorUnitario;
    }
}
