package ar.edu.info.unlp.ejercicio17;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.security.Permission;
import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class ReservaTest {
    Reserva reserva;
    Usuario usuario;
    DateLapse periodo;

    @BeforeEach
    void setUp(){
        usuario = new Usuario("Pepe", "Av Mitre", 1111);
        periodo = new DateLapse(LocalDate.of(2022, 10, 1), LocalDate.of(2022, 10, 5));
        reserva = new Reserva(50, usuario, periodo);
    }

    @Test
    void calcularPrecio() {
        assertEquals(200, reserva.calcularPrecio());
    }
}