package ar.edu.info.unlp.ejercicio25;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.List;
import java.util.Locale;

public abstract class ServicioMedico extends Servicio{
    private Veterinario veterinario;

    public ServicioMedico(Veterinario veterinario, Mascota mascota){
        super(mascota);
        this.veterinario = veterinario;
    }

    protected double obtenerAdicionalPorDia(LocalDate fecha){
        return fecha.getDayOfWeek() == DayOfWeek.SUNDAY ? 200 : 0;
    }

    public Veterinario getVeterinario(){
        return this.veterinario;
    }
}
