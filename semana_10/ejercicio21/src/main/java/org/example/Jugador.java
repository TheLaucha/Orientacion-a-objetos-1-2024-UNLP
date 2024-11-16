package org.example;

import java.util.Objects;

public class Jugador {
    private String apellido;
    private String nombre;

    public Jugador (String apellido, String nombre){
        this.apellido = apellido;
        this.nombre = nombre;
    }

    // Sobrescribir equals()
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Jugador jugador = (Jugador) o;
        return Objects.equals(nombre, jugador.nombre) &&
                Objects.equals(apellido, jugador.apellido);
    }

    // Sobrescribir hashCode()
    @Override
    public int hashCode() {
        return Objects.hash(nombre, apellido);
    }
}
