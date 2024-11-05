package ar.edu.info.unlp.ejercicio17;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
    private String nombre;
    private String direccion;
    private int DNI;
    List<Propiedad> propiedades;

    public Usuario(String nombre, String direccion, int dni){
        this.nombre = nombre;
        this.direccion = direccion;
        this.DNI = dni;
        this.propiedades = new ArrayList<Propiedad>();
    }

    public String getNombre() {
        return nombre;
    }

    public int getDNI() {
        return DNI;
    }

    public String getDireccion() {
        return direccion;
    }

    public double calcularIngreso(){
        // Se debe calcular la retribución a un propietario, la cual es el 75% de la suma de precio
        // totales de las reservas incluidas en un período específico de tiempo.
        double total = this.propiedades.stream()
                .flatMap(prop -> prop.reservas.stream())
                .mapToDouble(reserva -> reserva.calcularPrecio())
                .sum();
        System.out.println("Total: " + total);
        return total * 0.75;
    }

    public void agregarPropiedad(Propiedad prop){
        this.propiedades.add(prop);
    }
}
