package productos;

public class Bebidas extends Producto{
    public String sabor;

    public Bebidas(Double costoCompra, Double costoVenta, String marca, String lote, String sabor) {
        super(costoCompra, costoVenta, marca, lote);
        this.sabor = sabor;
    }

    @Override
    public String toString() {
        return super.toString()+ " Sabor" + sabor;
    }

}
