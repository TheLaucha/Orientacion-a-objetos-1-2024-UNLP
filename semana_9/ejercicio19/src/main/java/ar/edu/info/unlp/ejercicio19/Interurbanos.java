package ar.edu.info.unlp.ejercicio19;

public class Interurbanos extends Envio{
    private double distanciaKm;

    public Interurbanos(String dirOrigen, String dirDestino, double pesoEnGramos, double distanciaKm){
        super(dirOrigen,dirDestino,pesoEnGramos);
        this.distanciaKm = distanciaKm;
    }

    @Override
    double calcularMonto() {
        double aux = 0;
        if (this.distanciaKm < 100){
            aux = this.getPesoEnGramos() * 20;
        }else if (this.distanciaKm >= 100 && this.distanciaKm <= 500){
            aux = this.getPesoEnGramos() * 25;
        }else {
            aux = this.getPesoEnGramos() * 30;
        }
        return aux;
    }
}
