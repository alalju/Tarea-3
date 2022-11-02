import empresa.Almacen;
import empresa.Contratacion;
import empresa.Empresa;
import productos.*;
import trabajadores.Administrador;
import trabajadores.Empleado;
import trabajadores.OpAlmacen;
import trabajadores.OpTranporte;

public class Main {
    public static void main(String[] args) {
        Empleado empleados;
        Empresa empresa=new Empresa();
        Almacen almacen=new Almacen();
        Contratacion cont;
        int contador;

        empresa.setEmpleados(new Contratacion(new Administrador("Maria","Robles",
                27,"F", 1000,"19-Nov-02","Fijo")));
        empresa.setEmpleados(new Contratacion(new OpAlmacen("Juan","Robles",
                27,"F", 1000,"19-Nov-02","Honorario")));
        empresa.setEmpleados(new Contratacion(new OpTranporte("Jose","Robles",
                27,"F", 1000,"19-Nov-02","Temporal",10,24)));



        for (Contratacion tem: empresa.getEmpleados()) {

            System.out.println( "Nombre de clase: " + tem.getClass().getName()+ " : " + tem);
        }

        almacen.setProductos(new LineaBlanca(500.0,5000.0,"Mave","1234","x","123x"));
        almacen.setProductos(new Alimentos(5.00,10.0, "Bimbo", "12345","24 03 22"));
        almacen.setProductos(new ArtLimpieza(20.0, 30.0,"Ensueño", "12345","Freza", "Suevizante"));
        almacen.setProductos(new Bebidas(6.0, 12.0, "Boing","1368","Uva"));

        for (Producto tem: almacen.getProductos()) {
            System.out.println( "Nombre de clase: " + tem.getClass().getName()+ " : " + tem);
        }

    }
}