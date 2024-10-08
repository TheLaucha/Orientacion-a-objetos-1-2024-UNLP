package ar.edu.info.unlp.ejercicio12;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PrismaRectangularTest {
    Pieza prisma;

    @BeforeEach
    void setUp(){
        prisma = new PrismaRectangular("Hierro", "Rojo", 20,5,15);
    }

    @Test
    void getVolumen() {
        assertEquals(1500,prisma.getVolumen());
    }

    @Test
    void getSuperficie() {
        assertEquals(950,prisma.getSuperficie());
    }
}