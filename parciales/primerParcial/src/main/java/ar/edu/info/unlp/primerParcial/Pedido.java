package ar.edu.info.unlp.primerParcial;


import java.time.LocalDate;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Pedido {
    private LocalDate fechaPedido;
    private Map<Producto, Integer> items;

    public Pedido(){
        this.fechaPedido = LocalDate.now();
        this.items = new HashMap<Producto, Integer>();
    }

    public LocalDate getFechaPedido(){
        return this.fechaPedido;
    }

    public void agregarItem(Producto p, int cant){
        this.items.put(p, cant);
    }

    public int calcularCantidad(Producto p){
        return this.items.getOrDefault(p, 0);
    }

    public double calcularCostoPedido(){
        return this.items.entrySet().stream().mapToDouble(e -> {
            Producto p = e.getKey();
            int cant = e.getValue();
            double impuesto = p.calcularImpuesto(cant);
            double costoProd = p.getCostoUnitario() * cant + impuesto;
            return costoProd;
        }).sum();
    }
}
