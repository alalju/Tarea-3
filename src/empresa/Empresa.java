package empresa;

import productos.Producto;
import trabajadores.Empleado;

import java.util.ArrayList;

public class Empresa {
    Producto producto;
    ArrayList<Contratacion> empleados;
    Contratacion contratacion;

    public Empresa(){
        empleados=new ArrayList<>();
    }



    public ArrayList<Contratacion> getEmpleados() {
        return empleados;
    }

    public void setEmpleados(Contratacion empleados){
        this.empleados.add(empleados);
    }




}
