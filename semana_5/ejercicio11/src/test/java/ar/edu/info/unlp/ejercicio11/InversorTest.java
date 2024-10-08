package ar.edu.info.unlp.ejercicio11;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InversorTest {
    Inversor inversor;
    Inversion inversion;

    @BeforeEach
    void setUp(){
        inversor = new Inversor("Lautaro");
        inversion = new PlazoFijo(5000,2);
        inversor.agregarInversion(inversion);
        inversion = new InversionEnAcciones("YPF",5,15);
        inversor.agregarInversion(inversion);
        inversion = new PlazoFijo(10000,0.7);
        inversor.agregarInversion(inversion);

    }

    @Test
    void agregarInversion() {
        inversion = new PlazoFijo(15000,5);
        inversor.agregarInversion(inversion);
        assertTrue(inversor.getInversiones().contains(inversion));
        assertEquals(4, inversor.getInversiones().size());
    }

    @Test
    void valorActual() {
        System.out.println(inversor.getInversiones());
        assertEquals(17625, inversor.valorActual());
    }
}