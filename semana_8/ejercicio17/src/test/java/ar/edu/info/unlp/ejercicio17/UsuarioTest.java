package ar.edu.info.unlp.ejercicio17;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class UsuarioTest {
    Usuario usuarioSinPropiedades;
    Usuario usuarioSinAlquileres;
    Usuario usuarioConAlquileres;
    Propiedad prop1;
    Propiedad prop2;
    Propiedad prop3;
    Propiedad prop4;
    DateLapse periodo1;
    DateLapse periodo2;


    @BeforeEach
    void setUp(){
        usuarioSinPropiedades = new Usuario("Pepe", "Av Mitre", 1111);
        usuarioSinAlquileres = new Usuario("Juan", "calle 2", 2222);
        usuarioConAlquileres = new Usuario("Marta", "Calle Falsa", 3333);

        prop1 = new Propiedad("dir1", "prop1", 10);
        prop2 = new Propiedad("dir2", "prop2", 20);
        prop3 = new Propiedad("dir3", "prop3", 5);
        prop4 = new Propiedad("dir4", "prop4", 50);

        usuarioSinAlquileres.agregarPropiedad(prop1);
        usuarioSinAlquileres.agregarPropiedad(prop2);

        usuarioConAlquileres.agregarPropiedad(prop3);
        usuarioConAlquileres.agregarPropiedad(prop4);

        prop3.crearReserva(LocalDate.of(2022, 10, 1), LocalDate.of(2022, 10, 5), usuarioSinPropiedades);
        prop4.crearReserva(LocalDate.of(2022, 10, 10), LocalDate.of(2022, 10, 15), usuarioSinPropiedades);
    }

    @Test
    void calcularIngreso() {
        assertEquals(0, usuarioSinPropiedades.calcularIngreso());
        assertEquals(0, usuarioSinAlquileres.calcularIngreso());
        assertEquals(202.5, usuarioConAlquileres.calcularIngreso());
    }
}