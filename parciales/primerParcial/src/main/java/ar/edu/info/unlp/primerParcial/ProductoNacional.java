package ar.edu.info.unlp.primerParcial;

public class ProductoNacional extends Producto{

    public ProductoNacional(String nombre, double costoUnitario, String descripcion) {
        super(nombre, costoUnitario, descripcion);
    }

    @Override
    public double calcularImpuesto(int cantidad) {
        return 0;
    }
}
