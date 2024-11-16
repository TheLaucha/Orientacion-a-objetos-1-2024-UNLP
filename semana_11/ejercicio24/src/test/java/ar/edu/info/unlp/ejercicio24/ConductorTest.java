package ar.edu.info.unlp.ejercicio24;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConductorTest {
    Conductor conductor;
    Vehiculo vehiculo;

    @BeforeEach
    void setUp(){
        conductor = new Conductor("Otto", 500);
        vehiculo = new Vehiculo("Fiat", 3, 2020, 200000, conductor);
    }

    @Test
    void cargarSaldo() {
    }
}