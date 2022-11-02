package productos;

public class Producto {
    public Double costoCompra;
    public Double costoVenta;
    public String marca;
    public String lote;

    public Producto(Double costoCompra, Double costoVenta, String marca, String lote) {
        this.costoCompra = costoCompra;
        this.costoVenta = costoVenta;
        this.marca = marca;
        this.lote = lote;
    }

    @Override
    public String toString() {
        return "Producto: " +
                "costoCompra=" + costoCompra +
                ", costoVenta=" + costoVenta +
                ", marca='" + marca + '\'' +
                ", lote='" + lote + '\'' ;
    }
}
