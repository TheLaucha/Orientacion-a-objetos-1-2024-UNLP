package ar.edu.info.unlp.ejercicio15;

public class Tarifario {
    private double precioKWH;

    public Tarifario(){
        this(10);
    }

    public Tarifario(double precioKWH){
        this.precioKWH = precioKWH;
    }

    public double getPrecioKWH() {
        return this.precioKWH;
    }

    public void setPrecioKWH(double precioKWH){
        this.precioKWH = precioKWH;
    }
}
