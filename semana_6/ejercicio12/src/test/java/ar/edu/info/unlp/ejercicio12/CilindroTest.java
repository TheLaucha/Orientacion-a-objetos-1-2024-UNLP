package ar.edu.info.unlp.ejercicio12;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CilindroTest {
    Pieza cilindro;

    @BeforeEach
    void setUp(){
        cilindro = new Cilindro("Hierro", "Azul", 20,10);
    }

    @Test
    void getVolumen() {
        assertEquals(12566.370614359173,cilindro.getVolumen());
    }

    @Test
    void getSuperficie() {
        assertEquals(3769.9111843077517,cilindro.getSuperficie());
    }
}