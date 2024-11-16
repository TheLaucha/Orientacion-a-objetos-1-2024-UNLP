package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class JugadorTest {
    Map<Jugador, Integer> map;
    Jugador j1;
    Jugador j2;
    Jugador j3;
    Jugador j4;

    @BeforeEach
    void setUp(){
        map = new HashMap<>();
        j1 = new Jugador("Messi", "Lionel");
        j2 = new Jugador("Batistuta", "Gabriel");
        j3 = new Jugador("Aguero", "Kun");
        map.put(j1, 111);
        map.put(j2, 56);
        map.put(j3, 42);
        j4 = new Jugador("Aguero", "Kun");  // Nueva instancia con los mismos valores
    }

    @Test
    public void eliminarEntradas(){
        assertTrue(map.containsKey(j3));
        assertTrue(map.containsKey(j4));
        assertEquals(42, map.remove(j3));
        assertFalse(map.containsKey(j3));
    }

    @Test
    public void actualizarGoles(){
        //assertEquals(111, map.replace("Lionel Messi", 112)); // Retorna el valor antiguo
        //assertEquals(112, map.get("Lionel Messi"));
    }

    @Test
    public void repetirClave(){
        //assertEquals(56, map.get("Gabriel Batistuta"));
        //map.put("Gabriel Batistuta", 60);
        // Ante una clave existente, el valor se actualiza.
        //assertEquals(60, map.get("Gabriel Batistuta"));
    }

    @Test
    public void cantidadTotalDeGoles(){
        //assertEquals(209, map.values().stream().mapToInt(v -> v).sum());
    }
}