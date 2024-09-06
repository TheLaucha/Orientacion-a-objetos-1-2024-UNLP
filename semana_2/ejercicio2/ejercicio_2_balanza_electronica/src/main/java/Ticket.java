import java.time.LocalDate;

public class Ticket {
    private LocalDate fecha;
    private int cantidadDeProductos;
    private double pesoTotal;
    private double precioTotal;

    public Ticket(int cantProductos, double pesoTotal, double precioTotal){
        this.fecha = LocalDate.now();
        this.cantidadDeProductos = cantProductos;
        this.pesoTotal = pesoTotal;
        this.precioTotal = precioTotal;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public int getCantidadDeProductos() {
        return cantidadDeProductos;
    }

    public double getPesoTotal() {
        return pesoTotal;
    }

    public double getPrecioTotal() {
        return precioTotal;
    }

    public double impuesto(){
        double impuesto = this.precioTotal * 0.21;
        return impuesto;
    }
}
