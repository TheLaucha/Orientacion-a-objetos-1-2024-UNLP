package ar.edu.info.unlp.primerParcial;

public abstract class Producto {
    private String nombre;
    private double costoUnitario;
    private String descripcion;

    public Producto(String nombre, double costoUnitario, String descripcion){
        this.nombre = nombre;
        this.costoUnitario = costoUnitario;
        this.descripcion = descripcion;
    }

    public double getCostoUnitario(){
        return this.costoUnitario;
    }

    public abstract double calcularImpuesto(int cantidad);
}
