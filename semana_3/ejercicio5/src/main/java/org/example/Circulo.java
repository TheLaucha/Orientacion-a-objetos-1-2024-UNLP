package org.example;

import org.w3c.dom.css.CSSImportRule;

public class Circulo implements Figura{
    private double diametro;
    private double radio;

    /*
    public Circulo(double diametro, double radio){
        this.diametro = diametro;
        this.radio = radio;
    }
     */

    public double getDiametro(){
        return this.diametro;
    }

    public void setDiametro(double diametro){
        this.diametro = diametro;
        this.radio = diametro/2;
    }

    public double getRadio(){
        return this.radio;
    }

    public void setRadio(double radio){
        this.radio = radio;
        this.diametro = radio*2;
    }

    public double getPerimetro(){
        double perimetro = Math.PI * this.diametro;
        return perimetro;
    }

    public double getArea(){
        double area = Math.PI * Math.pow(this.radio, 2);
        return area;
    }
}
