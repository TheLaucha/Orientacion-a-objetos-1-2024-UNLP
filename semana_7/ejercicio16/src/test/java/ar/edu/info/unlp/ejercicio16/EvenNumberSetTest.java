package ar.edu.info.unlp.ejercicio16;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class EvenNumberSetTest {
    Set<Integer> numbers;

    @BeforeEach
    void setUp(){
        numbers = new EvenNumberSet();
    }

    @Test
    void add() {
        assertFalse(numbers.add(1));
        assertTrue(numbers.add(2));
        assertTrue(numbers.add(4));
        assertFalse(numbers.add(2));
    }

    @Test
    void addAll() {
    }
}