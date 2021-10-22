package domain.infraBD;

import domain.contex.Context;
import domain.model.Cliente;
import domain.model.Empleado;

public class SqlImplementacion implements Context {

    @Override
    public void crearCliente(Cliente cliente) {
    System.out.println("se creo el cliente: "+cliente.getNombre()+" en la base de datos");

    }

    @Override
    public Cliente consultarCliente(String nombre) {
        return null;
    }

    @Override
    public void crearEmpleado(Empleado empleado) {
        System.out.println("se creo el empleado: "+empleado.getNombre()+" en la base de datos");
    }

    @Override
    public Empleado consultarEmpleado(String nombre) {
        return null;
    }

    @Override
    public void eliminarPersona(String nombre) {

    }
}
