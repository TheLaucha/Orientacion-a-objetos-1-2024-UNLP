package ar.edu.info.unlp.ejercicio25;

import java.time.LocalDate;

public class Guarderia extends Servicio{
    private int cantDias;

    public Guarderia(Mascota mascota, int cantDias){
        super(mascota);
        this.cantDias = cantDias;
    }

    private boolean verificarDescuento(){
        return this.getMascota().getServicios().size() >= 5;
    }

    @Override
    public double calcularCosto() {
        double costoTotal = 500 * cantDias;
        if (verificarDescuento()){
            costoTotal = costoTotal - (costoTotal * 0.1);
        }
        return costoTotal;
    }
}
