package productos;

public class LineaBlanca extends Producto{
    public String modelo;
    public String serie;

    public LineaBlanca(Double costoCompra, Double costoVenta, String marca, String lote, String modelo, String serie) {
        super(costoCompra, costoVenta, marca, lote);
        this.modelo = modelo;
        this.serie = serie;
    }
    @Override
    public String toString() {
        return super.toString()+ " Modelo:" +modelo + " Serie:" + serie;
    }
}

