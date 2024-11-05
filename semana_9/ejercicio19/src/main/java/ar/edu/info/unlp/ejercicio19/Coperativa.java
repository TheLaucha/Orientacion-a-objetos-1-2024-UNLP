package ar.edu.info.unlp.ejercicio19;

import java.time.LocalDate;

public class Coperativa extends Cliente{
    private String CUIL;

    public Coperativa(String nombre, String direccion, String CUIL){
        super(nombre, direccion);
        this.CUIL = CUIL;
    }

}
