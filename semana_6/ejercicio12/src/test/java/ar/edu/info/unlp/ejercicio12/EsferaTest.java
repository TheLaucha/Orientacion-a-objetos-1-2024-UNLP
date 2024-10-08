package ar.edu.info.unlp.ejercicio12;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EsferaTest {
    Pieza esfera;

    @BeforeEach
    void setUp(){
        esfera = new Esfera("Hierro", "Amarillo", 20);
    }

    @Test
    void getVolumen() {
        assertEquals(33510, esfera.getVolumen());
    }

    @Test
    void getSuperficie() {
        assertEquals(5026.5472, esfera.getSuperficie());
    }
}