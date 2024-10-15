package ar.edu.info.unlp.ejercicio13;

import java.util.ArrayList;
import java.util.List;

public class Carpeta {
    private String nombre;
    private List<Email> emails;

    public Carpeta(String nombre){
        this.nombre = nombre;
        this.emails = new ArrayList<Email>();
    }

    public String getNombre(){
        return this.nombre;
    }

    public void mover(Email email, Carpeta destino){
        // Asumo que existe el email en la carpeta de origen.
        destino.almacenarEmail(email);
        this.emails.remove(email);
    }

    public void almacenarEmail(Email email){
        this.emails.add(email);
    }

    public List<Email> getEmails(){
        return this.emails;
    }

    public Email buscar(String texto){
        return this.emails.stream()
                .filter(email -> email.getCuerpo().contains(texto) || email.getTitulo().contains(texto))
                .findFirst()
                .orElse(null);
    }

    public int espacioOcupado(){
        return this.emails.stream().mapToInt(email -> email.espacioOcupado()).sum();
    }
}
