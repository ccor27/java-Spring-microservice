package domain.model;

public class Cliente extends Persona{

    private String email;

    public Cliente(String nombre, int edad, int cedula, String email) {
        super(nombre, edad, cedula);
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
