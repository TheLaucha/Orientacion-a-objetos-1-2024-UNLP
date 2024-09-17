package org.example;

public class Cuerpo3D {
    private double altura;
    private Figura caraBasal;

    public double getAltura(){
        return this.altura;
    }

    public void setAltura(double altura){
        this.altura = altura;
    }

    public void setCaraBasal(Figura cara){
        this.caraBasal = cara;
    }

    public double getVolumen(){
        double volumen = caraBasal.getArea() * altura;
        return volumen;
    }

    public double getSuperficieExterior(){
        double superficieExterior = 2 * caraBasal.getArea() + caraBasal.getPerimetro() * altura;
        return superficieExterior;
    }


}
