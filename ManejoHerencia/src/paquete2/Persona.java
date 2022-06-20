package paquete2;

public class Persona {

    String nombre;
    String apellido;
    String username;

    public Persona(String n, String a, String u) {
        nombre = n;
        apellido = a;
        username = u;
    }

    public void establecerNombre(String x) {
        nombre = x;
    }

    public void establecerApellido(String x) {
        apellido = x;
    }

    public void establecerUsername(String x) {
        username = x;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public String obtenerApellido() {
        return apellido;
    }

    public String obtenerUsername() {
        return username;
    }
    
    @Override
    public String toString(){
        String datos = String.format("\n\tNombre: %s\n"
                + "\tApellido: %s\n"
                + "\tUsername: %s\n",
                obtenerNombre(),
                obtenerApellido(),
                obtenerUsername());
        return datos;
    }
}
