package application;

import domain.contex.Context;
import domain.infraBD.SqlImplementacion;
import domain.model.Cliente;
import domain.model.Empleado;
import domain.services.ServicioCliente;
import domain.services.ServicioEmpleado;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BancoApplication implements CommandLineRunner {

    private SqlImplementacion bd;
    private ServicioCliente servicioCliente;
    private ServicioEmpleado servicioEmpleado;

    public static void main(String[] args) {
		SpringApplication.run(BancoApplication.class, args);
	}
    @Override
    public void run(String... args)  {
        bd = new SqlImplementacion();
        servicioCliente = new ServicioCliente(bd);
        servicioEmpleado = new ServicioEmpleado(bd);

        Empleado empleado = new Empleado("cristian",19,1234,2000);
        Cliente cliente = new Cliente("samuel",11,5678,"samuel@gmail.com");
        servicioEmpleado.crearEmpleado(empleado);
        servicioCliente.crearCliente(cliente);
    }
}
