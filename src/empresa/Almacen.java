package empresa;

import productos.Producto;

import java.util.ArrayList;

public class Almacen {
    ArrayList<Producto> productos;

    public Almacen(){
        productos=new ArrayList<>();
    }

    public ArrayList<Producto> getProductos() {
        return productos;
    }

    public void setProductos(Producto productos){
        this.productos.add(productos );
    }

}
