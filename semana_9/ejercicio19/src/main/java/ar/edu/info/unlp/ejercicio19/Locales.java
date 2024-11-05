package ar.edu.info.unlp.ejercicio19;

public class Locales extends Envio{
    private boolean entregaRapida;

    public Locales(String dirOrigen, String dirDestino, double pesoEnGramos, boolean entregaRapida){
        super(dirOrigen,dirDestino,pesoEnGramos);
        this.entregaRapida = entregaRapida;
    }

    @Override
    double calcularMonto() {
        return entregaRapida ? 500 : 1000;
    }
}
