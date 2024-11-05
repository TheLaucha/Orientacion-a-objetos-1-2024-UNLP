package ar.edu.info.unlp.ejercicio19;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Cliente {
    private String nombre;
    private String direccion;
    private List<Envio> envios;

    public Cliente(String nombre, String direccion){
        this.nombre = nombre;
        this.direccion = direccion;
        this.envios = new ArrayList<Envio>();
    }

    public List<Envio> getEnvios(){
        return this.envios;
    }

    public void agregarEnvio(Envio e){
        this.envios.add(e);
    }

    public double calcularMonto(DateLapse periodo){
        return this.envios.stream()
                    .filter(e -> periodo.includesDate(e.getFechaDespacho()))
                    .mapToDouble(e -> e.calcularMonto())
                    .sum();
    }


}
