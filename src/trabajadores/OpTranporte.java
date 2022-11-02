package trabajadores;

import empresa.IComprobarGasto;

public class OpTranporte extends Empleado implements IComprobarGasto {
    public double gastoGasolina;
    public double costoGasolina;
    public OpTranporte(String nombre, String apellido, int edad, String genero, double salarioBruto,
                       String fechaCont, String tipoCont) {
        super("Operador de Transporte",nombre, apellido, edad, genero, salarioBruto, fechaCont, tipoCont);
    }

    public OpTranporte(String nombre, String apellido, int edad, String genero, double salarioBruto,
                     String fechaCont, String tipoCont, double gastoGasolina, double costoGasolina) {
        super("Operador de Almacen",nombre, apellido, edad, genero, salarioBruto, fechaCont, tipoCont);
        this.costoGasolina=costoGasolina;
        this.gastoGasolina=gastoGasolina;
        comprobarGastos();
    }

    @Override
    public String comprobarGastos(){
        return "Litros de gasolina:"+ gastoGasolina +" Costo"+ costoGasolina+" Total:"+ gastoGasolina*costoGasolina;
    }

}
