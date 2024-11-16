package ar.edu.info.unlp.primerParcial;

public class ProductoImportado extends Producto{
    public ProductoImportado(String nombre, double costoUnitario, String descripcion) {
        super(nombre, costoUnitario, descripcion);
    }

    @Override
    public double calcularImpuesto(int cantidad) {
        return 0;
    }
}
