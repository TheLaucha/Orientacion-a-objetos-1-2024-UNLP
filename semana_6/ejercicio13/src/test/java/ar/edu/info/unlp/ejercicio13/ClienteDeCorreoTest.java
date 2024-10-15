package ar.edu.info.unlp.ejercicio13;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClienteDeCorreoTest {
    ClienteDeCorreo cliente;

    @BeforeEach
    void setUp(){
        cliente = new ClienteDeCorreo();
    }

    void agregarCarpetas(){
        Carpeta c1 = new Carpeta("PROMOCIONES");
        Carpeta c2 = new Carpeta("OFERTAS");
        Carpeta c3 = new Carpeta("TRABAJO");
        cliente.agregarCarpeta(c1);
        cliente.agregarCarpeta(c2);
        cliente.agregarCarpeta(c3);
    }

    void agregarEmails(){
        Email email1 = new Email("Titulo #1", "Cuerpo #1");
        Email email2 = new Email("Titulo #2", "Cuerpo #2");
        Email email3 = new Email("Titulo #2", "Cuerpo #3");
        cliente.recibir(email1);
        cliente.recibir(email2);
        cliente.recibir(email3);
    }

    @Test
    void getInbox() {
        Carpeta inbox = cliente.getInbox();
        assertEquals("Inbox", inbox.getNombre());
    }

    @Test
    void agregarCarpeta() {
        assertEquals(1,cliente.getCarpetas().size());
        Carpeta c = new Carpeta("PROMOCIONES");
        assertFalse(cliente.getCarpetas().contains(c));
        cliente.agregarCarpeta(c);
        assertEquals(2,cliente.getCarpetas().size());
        assertTrue(cliente.getCarpetas().contains(c));
    }

    @Test
    void getCarpetas() {
        assertEquals(1,cliente.getCarpetas().size());
        agregarCarpetas();
        assertEquals(4,cliente.getCarpetas().size());
    }

    @Test
    void recibir() {
        Email email = new Email("Titulo", "Cuerpo");
        cliente.recibir(email);
        assertTrue(cliente.getInbox().getEmails().contains(email));
        cliente.recibir(email);
        assertTrue(cliente.getInbox().getEmails().contains(email));
        assertEquals(2, cliente.getInbox().getEmails().size());
    }

    @Test
    void buscar() {
        agregarEmails();
        Email email1 = cliente.buscar("Titulo1");
        assertNull(email1);
        Email email2 = cliente.buscar("Titulo #1");
        assertTrue(cliente.getInbox().getEmails().contains(email2));
        Email email3 = cliente.buscar("Cuerpo #2");
        assertTrue(cliente.getInbox().getEmails().contains(email3));
    }

    @Test
    void espacioOcupado() {
        agregarEmails();
        assertEquals(54,cliente.espacioOcupado());
        agregarEmails();
        assertEquals(108,cliente.espacioOcupado());
    }




}