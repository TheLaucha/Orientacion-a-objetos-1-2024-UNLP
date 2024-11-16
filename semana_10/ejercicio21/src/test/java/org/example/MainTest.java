package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

public class MainTest {
    Map<String, Integer> map;

    @BeforeEach
    void setUp(){
        map = new HashMap<>();
        map.put("Lionel Messi", 111);
        map.put("Gabriel Batistuta", 56);
        map.put("Kun Aguero", 42);
    }

    @Test
    public void eliminarEntradas(){
        assertTrue(map.containsKey("Kun Aguero"));
        assertEquals(42, map.remove("Kun Aguero"));
        assertFalse(map.containsKey("Kun Aguero"));
    }

    @Test
    public void actualizarGoles(){
        assertEquals(111, map.replace("Lionel Messi", 112)); // Retorna el valor antiguo
        assertEquals(112, map.get("Lionel Messi"));
    }

    @Test
    public void repetirClave(){
        assertEquals(56, map.get("Gabriel Batistuta"));
        map.put("Gabriel Batistuta", 60);
        // Ante una clave existente, el valor se actualiza.
        assertEquals(60, map.get("Gabriel Batistuta"));
    }

    @Test
    public void cantidadTotalDeGoles(){
        assertEquals(209, map.values().stream().mapToInt(v -> v).sum());
    }
}