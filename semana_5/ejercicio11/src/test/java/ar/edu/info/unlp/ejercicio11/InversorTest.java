package ar.edu.info.unlp.ejercicio11;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InversorTest {
    Inversor inversor;
    Inversor inversor2;
    Inversion pf1;
    Inversion pf2;
    Inversion accion1;


    @BeforeEach
    void setUp(){
        inversor = new Inversor("Lautaro");
        inversor2 = new Inversor("Pepe");

        pf1 = new PlazoFijo(5000,2);
        inversor.agregarInversion(pf1);

        pf2 = new InversionEnAcciones("YPF",5,15);
        inversor.agregarInversion(pf2);

        accion1 = new PlazoFijo(10000,0.7);
        inversor.agregarInversion(accion1);
    }

    @Test
    void agregarInversion() {
        Inversion i = new PlazoFijo(15000,5);
        inversor.agregarInversion(i);

        assertTrue(inversor.getInversiones().contains(i));
        assertEquals(4, inversor.getInversiones().size());
    }

    @Test
    void valorActual() {
        assertEquals(18135, inversor.valorActual());
        assertEquals(0, inversor2.valorActual());
    }
}