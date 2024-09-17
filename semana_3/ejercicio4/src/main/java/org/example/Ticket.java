package org.example;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Ticket {
    private LocalDate fecha;
    private List<Producto> productos = new ArrayList<Producto>();

    public Ticket(List<Producto> productos){
        this.fecha = LocalDate.now();
        this.productos = productos;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public int getCantidadDeProductos() {
        return this.productos.size();
    }

    public double getPesoTotal() {
        return this.productos.stream().mapToDouble(prod -> prod.getPeso()).sum();
    }

    public double getPrecioTotal() {
        double aux = this.productos.stream().mapToDouble(prod -> prod.getPrecio()).sum();
        System.out.println("Precio total: " + aux);
        return aux;
    }

    public double impuesto(){
        double impuesto = this.getPrecioTotal() * 0.21;
        return impuesto;
    }
}
