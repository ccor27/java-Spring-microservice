package domain.model;

public class Empleado extends Persona{

    private double salario;

    public Empleado(String nombre, int edad, int cedula, double salario) {
        super(nombre, edad, cedula);
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
