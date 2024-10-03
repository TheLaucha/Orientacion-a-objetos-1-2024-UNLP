package ar.edu.info.unlp.ejercicio9;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CajaDeAhorroTest {

    CajaDeAhorro cajaDeAhorro;

    @BeforeEach
    void setup(){
        cajaDeAhorro = new CajaDeAhorro();
        cajaDeAhorro.depositar(5000);
    }

    @Test
    void puedeExtraer() {
        assertFalse(cajaDeAhorro.puedeExtraer(5000));
        assertTrue(cajaDeAhorro.puedeExtraer(4000));
        assertTrue(cajaDeAhorro.puedeExtraer(4900));
    }

    @Test
    void extraer(){
        assertFalse(cajaDeAhorro.extraer(5000));
        assertTrue(cajaDeAhorro.extraer(4000));
        assertEquals(920, cajaDeAhorro.getSaldo());
    }

    @Test
    void depositar(){
        cajaDeAhorro.depositar(5000);
        assertNotEquals(10000, cajaDeAhorro.getSaldo());
    }
}