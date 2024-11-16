package ar.edu.info.unlp.ejercicio25;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class ConsultaMedica extends ServicioMedico{
    public ConsultaMedica(Veterinario veterinario, Mascota mascota) {
        super(veterinario, mascota);
    }

    private double obtenerAdicionalPorAntiguedad(){
        int anioActual = LocalDate.now().getYear();
        int antiguedad = anioActual - this.getVeterinario().getFechaIngreso().getYear();
        return 100 * antiguedad;
    }

    @Override
    public double calcularCosto() {
        double honorariosVeterinario = this.getVeterinario().getHonorarios();
        double adicionalMateriales = 300;
        double adicionalDomingo = this.obtenerAdicionalPorDia(this.getFechaActual());
        double adicionalAntiguedad = obtenerAdicionalPorAntiguedad();

        return honorariosVeterinario + adicionalMateriales + adicionalDomingo + adicionalAntiguedad;
    }
}
