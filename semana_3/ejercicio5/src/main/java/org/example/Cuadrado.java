package org.example;

public class Cuadrado implements Figura{
    private double lado;

    /*
    public Cuadrado(double lado){
        this.lado = lado;
    }
     */

    public double getLado(){
        return this.lado;
    }

    public void setLado(double lado){
        this.lado = lado;
    }

    public double getPerimetro(){
        double perimetro = this.lado * 4;
        return perimetro;
    }

    public double getArea(){
        double area = this.lado * this.lado;
        return area;
    }

}
