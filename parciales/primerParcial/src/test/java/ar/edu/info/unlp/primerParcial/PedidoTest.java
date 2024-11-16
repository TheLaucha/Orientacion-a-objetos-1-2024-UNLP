package ar.edu.info.unlp.primerParcial;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PedidoTest {
    Pedido pedido;
    Producto producto;

    @BeforeEach
    void setUp(){
        this.pedido = new Pedido();
        this.producto = new ProductoNacional("Silla",500,"Silla de plastico");
        pedido.agregarItem(producto,5);
    }

    @Test
    void agregarItem() {
    }

    @Test
    void calcularCantidad() {
    }

    @Test
    void calcularCostoPedido() {
        System.out.println(this.pedido.calcularCostoPedido());
    }
}