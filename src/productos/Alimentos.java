package productos;

public class Alimentos extends Producto{
    public String caducidad;

    public Alimentos(Double costoCompra, Double costoVenta, String marca, String lote, String caducidad) {
        super(costoCompra, costoVenta, marca, lote);
        this.caducidad = caducidad;
    }

    @Override
    public String toString() {
        return super.toString()+ " Caducidad" +caducidad;
    }
}
