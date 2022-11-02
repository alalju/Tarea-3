package trabajadores;

public class Administrador extends Empleado {
    public Administrador(String nombre, String apellido, int edad, String genero,
                         double salarioBruto, String fechaCont, String tipoCont) {
        super("Administrador",nombre, apellido, edad, genero, salarioBruto, fechaCont, tipoCont);
    }
}
