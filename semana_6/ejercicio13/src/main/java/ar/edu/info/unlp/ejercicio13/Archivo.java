package ar.edu.info.unlp.ejercicio13;

public class Archivo {
    private String nombre;

    public Archivo(String nombre){
        this.nombre = nombre;
    }

    public int tamaño(){
        // El tamaño de un archivo es el largo de su nombre.
        return this.nombre.length();
    }
}
