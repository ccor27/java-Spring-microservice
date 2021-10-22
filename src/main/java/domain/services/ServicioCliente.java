package domain.services;

import domain.contex.Context;
import domain.model.Cliente;

public class ServicioCliente {
    private Context context;

    public ServicioCliente(Context context) {
        this.context = context;
    }

    public void crearCliente(Cliente cliente){
        context.crearCliente(cliente);
    }
    public Cliente consultarCLiente(String nombre){
        return context.consultarCliente(nombre);
    }
    public void eliminarCliente(String nombre){
        context.eliminarPersona(nombre);
    }
}
