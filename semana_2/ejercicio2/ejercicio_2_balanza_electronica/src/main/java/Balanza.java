public class Balanza {
    private int cantidadDeProductos;
    private double precioTotal;
    private double pesoTotal;

    public int getCantidadDeProductos() {
        return cantidadDeProductos;
    }

    public void setCantidadDeProductos(int cantidadDeProductos) {
        this.cantidadDeProductos = cantidadDeProductos;
    }

    public double getPrecioTotal() {
        return precioTotal;
    }

    public double setPrecioTotal(double precioTotal) {
        this.precioTotal = precioTotal;
        return precioTotal;
    }

    public double getPesoTotal() {
        return pesoTotal;
    }

    public void setPesoTotal(double pesoTotal) {
        this.pesoTotal = pesoTotal;
    }

    // En este tipo de casos deberia usar los metodos setter o la variable directamente ??
    public void ponerEnCero(){
        this.setCantidadDeProductos(0);
        this.setPesoTotal(0);
        this.setPrecioTotal(0);
    }

    public void agregarProducto(Producto producto){
        this.cantidadDeProductos++;
        this.pesoTotal += producto.getPeso();
        this.precioTotal += producto.getPrecio();
    }

    public Ticket emitirTicket(){
        Ticket t = new Ticket(this.cantidadDeProductos, this.pesoTotal, this.precioTotal);
        return t;
    }
}
