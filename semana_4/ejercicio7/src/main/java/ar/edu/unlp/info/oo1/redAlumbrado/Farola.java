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
            // Aca podria usar tambien otraFarola.getNeighbors().add(this)
            // Pero estaria modificando la lista de forma externa.
            otraFarola.pairWithNeighbor(this);
        }
    }

    public List<Farola> getNeighbors(){
        return this.vecinas;
    }

    public void turnOn(){
        if(!this.estaEncendida){
            this.estaEncendida = true;
            turnNeighbors();
        }
    }

    public void turnOff(){
        if(this.estaEncendida){
            this.estaEncendida = false;
            turnNeighbors();
        }
    }

    public boolean isOn(){
        return this.estaEncendida;
    }

    private void turnNeighbors(){
        for (Farola f: vecinas){
            if (this.estaEncendida) {
                f.turnOn();
            } else {
                f.turnOff();
            }
        }
    }

}
