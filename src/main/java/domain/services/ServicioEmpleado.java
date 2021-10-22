package domain.services;

import domain.contex.Context;
import domain.model.Empleado;

public class ServicioEmpleado {
    private Context context;

    public ServicioEmpleado(Context context) {
        this.context = context;
    }
    public void crearEmpleado(Empleado empleado){
        context.crearEmpleado(empleado);
    }
    public Empleado consultarEmpleado(String nombre){
        return  context.consultarEmpleado(nombre);
    }
    public void eliminarEmpleado(String nombre){
        context.eliminarPersona(nombre);
    }
}
