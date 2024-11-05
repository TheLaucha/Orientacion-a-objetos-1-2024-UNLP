package ar.edu.info.unlp.ejercicio19;

public class Internacionales extends Envio {

    public Internacionales(String dirOrigen, String dirDestino, double pesoEnGramos){
        super(dirOrigen,dirDestino,pesoEnGramos);
    }

    @Override
    double calcularMonto() {
        double aux = 5000;
        if (this.getPesoEnGramos() > 1000){
            aux += this.getPesoEnGramos() * 12;
        }else{
            aux += this.getPesoEnGramos() * 10;
        }
        return aux;
    }
}
