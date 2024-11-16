package ar.edu.info.unlp.primerParcial;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private String nombre;
    private String email;
    private LocalDate fechaAlta;
    private List<Pedido> pedidos;

    public Cliente(String nombre, String email){
        this.nombre = nombre;
        this.email = email;
        this.fechaAlta = LocalDate.now();
        this.pedidos = new ArrayList<Pedido>();
    }

    public void agregarPedido(Pedido p){
        this.pedidos.add(p);
    }

    // Retorna la cantidad total de un producto en especifico pedido por el cliente.
    public int calcularCantidadTotal(Producto p){
        return this.pedidos.stream().mapToInt(pedido -> pedido.calcularCantidad(p)).sum();
    }

    public double calcularCostoTotal(LocalDate desde, LocalDate hasta){
        return this.pedidos.stream()
                .filter(pedido -> (!pedido.getFechaPedido().isBefore(desde) && !pedido.getFechaPedido().isAfter(hasta)))
                .mapToDouble(pedido -> pedido.calcularCostoPedido())
                .sum();
    }
}
