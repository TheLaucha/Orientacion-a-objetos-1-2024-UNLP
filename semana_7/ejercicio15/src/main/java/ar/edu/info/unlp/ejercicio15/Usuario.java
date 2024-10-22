package ar.edu.info.unlp.ejercicio15;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Usuario {
    private String nombre;
    private String domicilio;
    private List<Consumo> consumos;

    public Usuario(String nombre, String domicilio){
        this.nombre = nombre;
        this.domicilio = domicilio;
        this.consumos = new ArrayList<Consumo>();
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

    public double costoDeConsumoEnergiaActiva(Tarifario tarifario){
        return this.consumos.get(this.consumos.size()-1).getConsumoEnergiaActiva() * tarifario.getPrecioKWH();
    }

    public boolean tieneBonificacion(){
        return this.consumos.get(this.consumos.size()-1).bonificacion();
    }

    public Factura emitirFactura(Tarifario tarifario){
        double montoFinal = this.costoDeConsumoEnergiaActiva(tarifario);
        double bonificacion = 0;

        if(this.tieneBonificacion()){
            bonificacion = montoFinal * 0.1;
            montoFinal -= bonificacion;
        }

        return new Factura(this, bonificacion, montoFinal);
    }
}
