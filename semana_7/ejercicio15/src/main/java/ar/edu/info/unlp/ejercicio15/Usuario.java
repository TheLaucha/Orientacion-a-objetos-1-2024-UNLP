package ar.edu.info.unlp.ejercicio15;

import java.time.LocalDate;
import java.util.List;

public class Usuario {
    private String nombre;
    private String domicilio;
    private List<Consumo> consumos;
    private Tarifario tarifario;

    public Usuario(){
        this.tarifario = new Tarifario();
    }

    public String getNombre(){
        return this.nombre;
    }

    public String getDomicilio(){
        return  this.domicilio;
    }

    public void agregarConsumo(Consumo consumo){
        this.consumos.add(consumo);
    }

    public double costoDeConsumoEnergiaActiva(){
        return this.consumos.getLast().getConsumoEnergiaActiva() * this.tarifario.getPrecioKWH();
    }

    public boolean tieneBonificacion(){
        return this.consumos.getLast().bonificacion();
    }

    public Factura emitirFactura(){
        double montoFinal = this.costoDeConsumoEnergiaActiva();
        double bonificacion = 0;

        if(this.tieneBonificacion()){
            bonificacion = this.costoDeConsumoEnergiaActiva() * 0.1;
            montoFinal -= bonificacion;
        }

        return new Factura(this, bonificacion, montoFinal);
    }
}
