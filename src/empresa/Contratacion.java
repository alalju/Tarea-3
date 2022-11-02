package empresa;

import trabajadores.Empleado;
import trabajadores.OpTranporte;

import java.util.Optional;

public class Contratacion {
   Empleado empleado;

   public Contratacion(Empleado empleado) {
      this.empleado = empleado;

   }

   @Override
   public String toString() {
               return "Contratacion" +
              "empleado=" + empleado +
              '}';
   }
}
