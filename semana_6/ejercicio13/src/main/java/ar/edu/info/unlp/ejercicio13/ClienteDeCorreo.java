package ar.edu.info.unlp.ejercicio13;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ClienteDeCorreo {
    Carpeta inbox;
    List<Carpeta> carpetas;

    public ClienteDeCorreo(){
        this.inbox = new Carpeta("Inbox");
        this.carpetas = new ArrayList<Carpeta>();
        this.carpetas.add(this.inbox);
    }

    public Carpeta getInbox(){
        return this.inbox;
    }

    public List<Carpeta> getCarpetas(){
        return this.carpetas;
    }

    public void agregarCarpeta(Carpeta carpeta){
        this.carpetas.add(carpeta);
    }

    public void recibir(Email email){
        inbox.almacenarEmail(email);
    }

    public Email buscar(String texto){
        // Buscar email en base al texto
        return this.carpetas.stream()
                .map(carpeta -> carpeta.buscar(texto))
                .filter(Objects::nonNull)
                .findFirst()
                .orElse(null);
    }

    public int espacioOcupado(){
        return this.carpetas.stream().mapToInt(carpeta -> carpeta.espacioOcupado()).sum();
    }


}
