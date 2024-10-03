package ar.edu.info.unlp.ejercicio9;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CuentaCorrienteTest {

    CuentaCorriente cuentaCorriente;

    @BeforeEach
    void setUp() {
        cuentaCorriente = new CuentaCorriente();
        cuentaCorriente.setDescubierto(-2000);
        cuentaCorriente.depositar(5000);
    }

    @Test
    void puedeExtraer() {
        assertEquals(true, cuentaCorriente.puedeExtraer(5000));
        assertEquals(true, cuentaCorriente.puedeExtraer(7000));
        assertEquals(false, cuentaCorriente.puedeExtraer(7001));
        assertEquals(false, cuentaCorriente.puedeExtraer(10000));
    }

    @Test
    void extraer() {
        cuentaCorriente.extraer(4000);
        assertEquals(1000, cuentaCorriente.getSaldo());
        cuentaCorriente.extraer(2000);
        assertEquals(-1000,cuentaCorriente.getSaldo());
    }


}