package ar.edu.info.unlp.ejercicio14;

import ar.edu.info.unlp.ejercicio14.DateLapseV2.DateLapse;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class DateLapseTest {
    private DateLapseInterface lapso;
    private DateLapseInterface lapso2;
    private DateLapseInterface lapso3;
    private LocalDate other;
    private LocalDate other2;

    @BeforeEach
    void setUp() throws Exception {
		this.lapso = new ar.edu.info.unlp.ejercicio14.DateLapse(LocalDate.of(2022, 10, 5), LocalDate.of(2022, 10, 15));
		this.lapso2 = new ar.edu.info.unlp.ejercicio14.DateLapse (LocalDate.of(2022, 10, 5), LocalDate.of(2022, 10, 5));
		this.lapso3 = new ar.edu.info.unlp.ejercicio14.DateLapse (LocalDate.of(2022, 10, 15), LocalDate.of(2022, 10, 5));
        /*
        this.lapso = new DateLapse(LocalDate.of(2022, 10, 5), 10);
        this.lapso2 = new DateLapse (LocalDate.of(2022, 10, 5), 0);
        this.lapso3 = new DateLapse (LocalDate.of(2022, 10, 15), -10);
        */
        this.other = LocalDate.of(2022,10, 7);
        this.other2 = LocalDate.of(2022,10, 3);
    }

    @Test
    void testConstructor() {
        assertEquals(5,this.lapso.getFrom().getDayOfMonth());
        assertEquals(10,this.lapso.getFrom().getMonthValue());
        assertEquals(2022,this.lapso.getFrom().getYear());
        assertEquals(15,this.lapso.getTo().getDayOfMonth());
        assertEquals(10,this.lapso.getTo().getMonthValue());
        assertEquals(2022,this.lapso.getTo().getYear());
    }

    @Test
    void testSizeInDays() {
        assertEquals(10,this.lapso.sizeInDays());
        assertEquals(0,this.lapso2.sizeInDays());
        assertEquals(-10,this.lapso3.sizeInDays());
    }

    @Test
    void testIncludesDate() {
        assertTrue(this.lapso.includesDate(other));
        assertFalse(this.lapso.includesDate(other2));
        assertFalse(this.lapso2.includesDate(other));
        assertFalse(this.lapso3.includesDate(other));
    }
}