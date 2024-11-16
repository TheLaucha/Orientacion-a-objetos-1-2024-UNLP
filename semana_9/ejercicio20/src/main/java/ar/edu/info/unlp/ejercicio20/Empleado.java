package ar.edu.info.unlp.ejercicio20;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Empleado {
    private String nombre;
    private String apellido;
    private String CUIL;
    private LocalDate fnac;
    private boolean hijos;
    private List<Contrato> contratos;

    public Empleado (String nombre, String apellido, String CUIL, LocalDate fnac, boolean hijos){
        this.nombre = nombre;
        this.apellido = apellido;
        this.CUIL = CUIL;
        this.fnac = fnac;
        this.hijos = hijos;
        this.contratos = new ArrayList<Contrato>();
    }

    public void agregarContrato(Contrato contrato){
        this.contratos.add(contrato);
    }

    // ?? Esta bien retornar el primer contrato activo que encuentre ?
    // En teoria no deberia haber mas de un contrato activo
    // Que pasa si no hay un contrato activo y retorna null ?
    public Contrato contratoActivo(){
        return this.contratos.stream().filter(c -> c.estaActivo()).findFirst().orElse(null);
    }

    public int calcularAntiguedad(){
        return this.contratos.stream().mapToInt(c -> c.calcularDuracionEnAnios()).sum();
    }

    public double calcularMontoTotal(){
        double montoBasico = this.contratoActivo().montoBasico();
        int porcentajeAdicional = 0;
        int antiguedad = this.calcularAntiguedad();
        if (antiguedad > 20) {
            porcentajeAdicional = 100;
        } else if (antiguedad > 15) {
            porcentajeAdicional = 70;
        } else if (antiguedad > 10) {
            porcentajeAdicional = 50;
        } else if (antiguedad > 5) {
            porcentajeAdicional = 30;
        }

        double montoAdicional = montoBasico * porcentajeAdicional / 100;

        return montoBasico + montoAdicional;
    }

    // ?? Esto es correcto ?
    // Deberia pasar los atributos individualmente ?
    public ReciboDeSueldo generarReciboDeSueldo(){
        return new ReciboDeSueldo(this, this.calcularAntiguedad(), this.calcularMontoTotal());
    }
}
