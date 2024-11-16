package ar.edu.info.unlp.ejercicio25;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public abstract class Servicio {
    private Mascota mascota;
    private LocalDate fechaActual;

    public Servicio(Mascota mascota){
        this.mascota = mascota;
        this.fechaActual = LocalDate.now();
    }

    public LocalDate getFechaActual(){
        return  this.fechaActual;
    }

    public Mascota getMascota(){
        return  this.mascota;
    }

    public abstract double calcularCosto();
}
