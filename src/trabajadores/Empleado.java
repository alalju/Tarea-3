package trabajadores;

import empresa.Pago;

public class Empleado {
    public String nombre;
    public String apellido;
    public int edad;
    public String genero;
    public double salarioBruto;
    public double salarioNeto;
    public String fechaCont;
    public String tipoCont;

    public String tipoEmp;

    Pago pago=new Pago();

    public Empleado(String tipoEmp,String nombre, String apellido, int edad, String genero,
                    double salarioBruto, String fechaCont, String tipoCont) {
        this.tipoEmp=tipoEmp;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.genero = genero;
        this.salarioBruto = salarioBruto;
        this.salarioNeto = pago.pagar(tipoCont,salarioBruto);
        this.fechaCont = fechaCont;
        this.tipoCont = tipoCont;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public double getSalarioBruto() {
        return salarioBruto;
    }

    public void setSalarioBruto(double salarioBruto) {
        this.salarioBruto = salarioBruto;
    }

    public double getSalarioNeto() {
        return salarioNeto;
    }

    public void setSalarioNeto(double salarioNeto) {
        this.salarioNeto = salarioNeto;
    }

    public String getFechaCont() {
        return fechaCont;
    }

    public void setFechaCont(String fechaCont) {
        this.fechaCont = fechaCont;
    }

    public String getTipoCont() {
        return tipoCont;
    }

    public void setTipoCont(String tipoCont) {
        this.tipoCont = tipoCont;
    }

    public String getTipoEmp() {
        return tipoEmp;
    }

    public void setTipoEmp(String tipoEmp) {
        this.tipoEmp = tipoEmp;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", edad=" + edad +
                ", genero='" + genero + '\'' +
                ", salarioBruto=" + salarioBruto +
                ", salarioNeto=" + salarioNeto +
                ", fechaCont='" + fechaCont + '\'' +
                ", tipoCont='" + tipoCont + '\'' +
                ", tipoEmp='" + tipoEmp + '\'' +
                ", pago=" + pago +
                '}';
    }
}
