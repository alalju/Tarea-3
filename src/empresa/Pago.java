package empresa;
/*
A los empleados se realizan sus pagos por su trabajo de acuerdo con los siguientes criterios:

Si es un empleado de contratación fija o temporal su salario neto mensual será su salario bruto
menos las deducciones de impuestos correspondientes, es decir IRS al 4%, fondo de ahorro 500 pesos,
IMSS 170 pesos mensuales.
Si se trata de un trabajador por honorarios se pagará lo equivalente a tres salarios mínimos
por actividad y un bono del 2% sobre el monto total si durante la jornada realizó más de una actividad.
 */

public class Pago {

    public double pago;

    public double pagar(String tipoPago, double salarioBruto){
        double salarioNeto = 0;
        if(tipoPago == "Temporal" || tipoPago == "Fijo"){
            PagoFijoTemporal pago1=new PagoFijoTemporal();
            salarioNeto=pago1.pagoFT(salarioBruto);
        }else{
            PagoHonorario pago2=new PagoHonorario();
            salarioNeto=pago2.pagoH(salarioBruto);
        }
        return salarioNeto;
    }

    private class PagoFijoTemporal{
        public double pagoFT(double salarioBruro){
            double isr=0;
            isr=salarioBruro*0.4;
            return salarioBruro-isr;
        }

    }

    private class PagoHonorario{
        public double pagoH(double salarioBruro){
            return 0;
        }
    }
}
