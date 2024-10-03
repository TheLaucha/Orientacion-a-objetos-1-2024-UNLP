package ar.edu.info.unlp.ejercicio9;

public class CajaDeAhorro extends Cuenta {

    public CajaDeAhorro(){
        super();
    }
    private double comision(double monto){
        return monto * 0.02;
    }

    @Override
    public void depositar(double monto){
        super.depositar(monto - this.comision(monto));
    }

    @Override
    protected boolean puedeExtraer(double monto) {
        return (this.getSaldo() - monto - this.comision(monto)) >= 0;
    }

    @Override
    protected void extraerSinControlar(double monto) {
        super.extraerSinControlar(monto+this.comision(monto));
    }


}
