package ar.edu.info.unlp.ejercicio6;

import java.time.LocalDate;

public class Mamifero {
    private String identificador;
    private String especie;
    private LocalDate fechaNacimiento;
    private Mamifero padre;
    private Mamifero madre;

    public Mamifero(){}

    public Mamifero(String id){
        this.identificador = id;
    }

    public String getIdentificador() {
        return identificador;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public Mamifero getPadre() {
        return this.padre != null ? this.padre : null;
    }

    public void setPadre(Mamifero padre) {
        this.padre = padre;
    }

    public Mamifero getMadre() {
        return this.madre != null ? this.madre : null;
    }

    public void setMadre(Mamifero madre) {
        this.madre = madre;
    }

    public Mamifero getAbueloMaterno() {
        return this.madre != null ? this.madre.getPadre() : null;
    }

    public Mamifero getAbuelaMaterna() {
        return this.madre != null ? this.madre.getMadre() : null;
    }

    public Mamifero getAbueloPaterno() {
        return this.padre != null ? this.padre.getPadre() : null;
    }

    public Mamifero getAbuelaPaterna() {
        return this.padre != null ? this.padre.getMadre() : null;
    }

    /*
    public boolean tieneComoAncestroA(Mamifero unMamifero){
        boolean aux = false;
        if (unMamifero.equals(this.getMadre()) || unMamifero.equals(this.getPadre()))
            aux = true;
        else {
            if (this.getMadre() != null)
                aux = this.getMadre().tieneComoAncestroA(unMamifero);
            else {
                if (this.getPadre() != null)
                    aux = this.getPadre().tieneComoAncestroA(unMamifero);
            }
        }
        return aux;
    }
    */

    public boolean tieneComoAncestroA(Mamifero unMamifero){
        return ( this.madre != null && (this.madre.equals(unMamifero) || this.madre.tieneComoAncestroA(unMamifero)))
                || (this.padre != null && (this.padre.equals(unMamifero) || this.padre.tieneComoAncestroA(unMamifero)));
    }

}
