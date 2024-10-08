package ar.edu.info.unlp.ejercicio12;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReporteDeConstruccionTest {
    ReporteDeConstruccion reporte;
    Pieza pieza;

    @BeforeEach
    void setUp(){
        reporte = new ReporteDeConstruccion();
        pieza = new Cilindro("Hierro", "Azul", 20,10);
        reporte.agregarPieza(pieza);
        pieza = new Esfera("Hierro", "Amarillo", 20);
        reporte.agregarPieza(pieza);
        pieza = new PrismaRectangular("Madera", "Azul", 20,5,15);
        reporte.agregarPieza(pieza);
    }

    @Test
    void agregarPieza() {
        assertEquals(3, reporte.getPiezas().size());
        pieza = new Cilindro("Hierro", "Azul", 20,10);
        reporte.agregarPieza(pieza);
        assertTrue(reporte.getPiezas().contains(pieza));
    }

    @Test
    void getVolumenDeMaterial() {
        assertEquals(46076.6922526503,reporte.getVolumenDeMaterial("Hierro"));
        assertEquals(1500,reporte.getVolumenDeMaterial("Madera"));
        assertEquals(0,reporte.getVolumenDeMaterial("Random"));
    }

    @Test
    void getSuperficieDeColor() {
        assertEquals(4719.911184307752, reporte.getSuperficieDeColor("Azul"));
        assertEquals(5026.548245743669, reporte.getSuperficieDeColor("Amarillo"));
        assertEquals(0, reporte.getSuperficieDeColor("Blanco"));
    }
}