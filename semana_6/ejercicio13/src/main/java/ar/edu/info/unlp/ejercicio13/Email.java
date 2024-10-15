package ar.edu.info.unlp.ejercicio13;

import java.util.ArrayList;
import java.util.List;

public class Email {
    private String titulo;
    private String cuerpo;
    private List<Archivo> adjuntos;

    public Email(String titulo, String cuerpo){
        this.titulo = titulo;
        this.cuerpo = cuerpo;
        this.adjuntos = new ArrayList<Archivo>();
    }

    public String getTitulo(){
        return this.titulo;
    }

    public String getCuerpo(){
        return  this.cuerpo;
    }

    public List<Archivo> adjuntos(){
        return this.adjuntos;
    }

    public void agregarArchivo(Archivo archivo){
        this.adjuntos.add(archivo);
    }

    public int espacioOcupado(){
        return this.titulo.length()
                + this.cuerpo.length()
                + this.adjuntos.stream()
                .mapToInt(archivo -> archivo.tamaño())
                .sum();
    }
}
