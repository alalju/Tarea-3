package productos;

public class ArtLimpieza extends Producto {
    public String aroma;
    public String tipo;

    public ArtLimpieza(Double costoCompra, Double costoVenta, String marca, String lote, String aroma, String tipo) {
        super(costoCompra, costoVenta, marca, lote);
        this.aroma = aroma;
        this.tipo = tipo;
    }
    @Override
    public String toString() {
        return super.toString()+ " Aroma:"+aroma + " Tipo:"+tipo;
    }
}
