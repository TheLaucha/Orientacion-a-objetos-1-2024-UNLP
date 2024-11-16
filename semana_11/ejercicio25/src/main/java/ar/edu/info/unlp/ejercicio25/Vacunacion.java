package ar.edu.info.unlp.ejercicio25;

import java.time.LocalDate;

public class Vacunacion extends ServicioMedico{
    private String nombreVacuna;
    private double costo;

    public Vacunacion(Veterinario veterinario, Mascota mascota, String nombreVacuna, double costo) {
        super(veterinario, mascota);
        this.nombreVacuna = nombreVacuna;
        this.costo = costo;
    }

    @Override
    public double calcularCosto() {
        double honorariosMedico = this.getVeterinario().getHonorarios();
        double adicionalMateriales = 500;
        double adicionalPorDia = this.obtenerAdicionalPorDia(this.getFechaActual());
        return honorariosMedico + this.costo + adicionalPorDia + adicionalMateriales;
    }


}
