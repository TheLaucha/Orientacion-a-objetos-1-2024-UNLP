package ar.edu.info.unlp.ejercicio15;

public class Consumo {
    private double consumoEnergiaActiva;
    private double consumoEnergiaReactiva;

    public Consumo(double energiaActiva, double energiaReactiva){
        this.consumoEnergiaActiva = energiaActiva;
        this.consumoEnergiaReactiva = energiaReactiva;
    }

    public double getConsumoEnergiaActiva(){
        return this.consumoEnergiaActiva;
    }

    public double factorDePotencia(){
        return this.consumoEnergiaActiva / Math.sqrt(Math.pow(this.consumoEnergiaActiva, 2) + Math.pow(this.consumoEnergiaReactiva, 2));
    }

    public boolean bonificacion(){
        return (this.factorDePotencia() > 0.8);
    }
}
