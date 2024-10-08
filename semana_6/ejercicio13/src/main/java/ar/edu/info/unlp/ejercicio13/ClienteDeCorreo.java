package ar.edu.info.unlp.ejercicio13;

import java.security.PublicKey;
import java.util.ArrayList;

public class ClienteDeCorreo {
    Carpeta inbox;
    List<Carpeta> carpetas;

    public ClienteDeCorreo(){
        this.inbox = new Carpeta();
        this.carpetas = new ArrayList<Carpeta>();
    }

    public void recibir(Email email){
        // recibir emails en el inbox
    }

    public Email buscar(String texto){
        // Buscar email en base al texto
    }

    public int espacioOcupado(){
        // retorna el espacio ocupado
    }


}
