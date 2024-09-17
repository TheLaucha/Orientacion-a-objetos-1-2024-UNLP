package org.example;

import java.time.LocalDate;
import java.util.ArrayList;

public class Presupuesto {
    private LocalDate fecha;
    private String cliente;
    private ArrayList<Item> items = new ArrayList<Item>();

    public Presupuesto(String cliente) {
        this.cliente = cliente;
        this.fecha = LocalDate.now();
    }

    public LocalDate getFecha(){
        return this.fecha;
    }

    public String getCliente(){
        return this.cliente;
    }

    public void agregarItem(Item item){
        this.items.add(item);
    }

    public double calcularTotal(){
        double total = items.stream().mapToDouble(item -> item.costo()).sum();
        return total;
    }
}
