package ar.edu.info.unlp.ejercicio9;

public class CuentaCorriente extends Cuenta{
    private double descubierto;

    public CuentaCorriente(){
        super();
        this.descubierto = 0;
    }

    public double getDescubierto(){
        return this.descubierto;
    }

    public void setDescubierto(double monto){
        this.descubierto = monto;
    }

    @Override
    protected boolean puedeExtraer(double monto){
        double restante = this.getSaldo() - monto;
        return restante >= this.descubierto;
    }
}
