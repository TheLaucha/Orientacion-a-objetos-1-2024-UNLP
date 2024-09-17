package org.example;

import java.util.ArrayList;
import java.util.List;

public class Balanza {
    private List<Producto> productos = new ArrayList<Producto>();

    public int getCantidadDeProductos() {
        return this.productos.size();
    }

    public double getPrecioTotal() {
        return this.productos.stream().mapToDouble(prod -> prod.getPrecio()).sum();
    }

    public double getPesoTotal() {
        return this.productos.stream().mapToDouble(prod -> prod.getPeso()).sum();
    }

    public void ponerEnCero(){
        this.productos.clear();
    }

    public void agregarProducto(Producto producto){
        this.productos.add(producto);
    }

    public List<Producto> getProductos(){
        return this.productos;
    }

    public Ticket emitirTicket(){
        Ticket t = new Ticket(this.getCantidadDeProductos(), this.getPesoTotal(), this.getPrecioTotal());
        return t;
    }
}
