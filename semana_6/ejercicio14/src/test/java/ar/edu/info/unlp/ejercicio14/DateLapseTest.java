package ar.edu.info.unlp.ejercicio14;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class DateLapseTest {
    DateLapse dateA;
    DateLapseB dateB;
    LocalDate from;
    LocalDate to;

    @BeforeEach
    void setUp(){
        from = LocalDate.of(1979,12,15);
        to = LocalDate.of(2032,12,15);
        dateA = new DateLapse(from, to);
        dateB = new DateLapseB(from, 19359);
    }

    @Test
    void getFrom() {
        assertEquals(from, dateA.getFrom());
        assertEquals(from, dateB.getFrom());
    }

    @Test
    void getTo() {
        assertEquals(to, dateA.getTo());
        assertEquals(to, dateB.getTo());
    }

    @Test
    void sizeInDays() {
        assertEquals(19359, dateA.sizeInDays());
        assertEquals(19359, dateB.sizeInDays());
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
        assertTrue(dateA.includesDate(hoy));
        assertTrue(dateB.includesDate(hoy));
        LocalDate inicio = LocalDate.of(1979,12,15);
        LocalDate fin = LocalDate.of(2032,12,15);
        assertTrue(dateA.includesDate(inicio));
        assertTrue(dateA.includesDate(fin));
        assertTrue(dateB.includesDate(inicio));
        assertTrue(dateB.includesDate(fin));
    }
}