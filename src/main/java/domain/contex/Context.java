package domain.contex;

import domain.model.Cliente;
import domain.model.Empleado;

public interface Context {

    void crearCliente(Cliente cliente);
    Cliente consultarCliente(String nombre);
    void crearEmpleado(Empleado empleado);
    Empleado consultarEmpleado(String nombre);
    void eliminarPersona(String nombre);
}
