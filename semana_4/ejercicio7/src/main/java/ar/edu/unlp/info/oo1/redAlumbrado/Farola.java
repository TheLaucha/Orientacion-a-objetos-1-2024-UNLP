package ar.edu.unlp.info.oo1.redAlumbrado;

import java.util.ArrayList;
import java.util.List;

public class Farola {
    private boolean estaEncendida;
    private List<Farola> vecinas;

    public Farola(){
        this.estaEncendida = false;
        this.vecinas = new ArrayList<Farola>();
    }

    public void pairWithNeighbor(Farola otraFarola){
        if(!this.vecinas.contains(otraFarola)){
            this.vecinas.add(otraFarola);
            otraFarola.pairWithNeighbor(this);
        }
    }

    public List<Farola> getNeighbors(){
        return this.vecinas;
    }

    public void turnOn(){
        if(!this.estaEncendida){
            this.estaEncendida = true;
            this.vecinas.stream().forEach(v -> v.turnOn());
        }
    }

    public void turnOff(){
        if(this.estaEncendida){
            this.estaEncendida = false;
            this.vecinas.stream().forEach(v -> v.turnOff());
        }
    }

    public boolean isOn(){
        return this.estaEncendida;
    }

}
