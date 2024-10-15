package ar.edu.info.unlp.ejercicio14;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class DateLapseTest {
    DateLapse date;
    LocalDate from;
    LocalDate to;

    @BeforeEach
    void setUp(){
        from = LocalDate.of(1979,12,15);
        to = LocalDate.of(2032,12,15);
        date = new DateLapse(from, to);
    }

    @Test
    void getFrom() {
        assertEquals(from, date.getFrom());
    }

    @Test
    void getTo() {
        assertEquals(to, date.getTo());
    }

    @Test
    void sizeInDays() {
        assertEquals(19359, date.sizeInDays());
        // Nuevas fechas
        from = LocalDate.of(2024,1,1);
        to = LocalDate.of(2024,2,1);
        DateLapse date2 = new DateLapse(from, to);
        assertEquals(31, date2.sizeInDays());
        // Mismas fechas
        from = LocalDate.of(2024,1,1);
        to = LocalDate.of(2024,1,1);
        DateLapse date3 = new DateLapse(from, to);
        assertEquals(0, date3.sizeInDays());
    }

    @Test
    void includesDate() {
        LocalDate hoy = LocalDate.now();
        assertTrue(date.includesDate(hoy));
        LocalDate inicio = LocalDate.of(1979,12,15);
        LocalDate fin = LocalDate.of(2032,12,15);
        assertTrue(date.includesDate(inicio));
        assertTrue(date.includesDate(fin));
    }
}