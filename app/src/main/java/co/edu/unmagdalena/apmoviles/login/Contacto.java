package co.edu.unmagdalena.apmoviles.login;

public class Contacto {
    private String nombre;
    private long telefono;
    private String tipo;
    private String email;

    public Contacto(String nombre, long telefono, String tipo, String email) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.tipo = tipo;
        this.email = email;
    }

    public String getNombre() {
        return nombre;
    }

    public long getTelefono() {
        return telefono;
    }

    public String getTipo() {
        return tipo;
    }

    public String getEmail() {
        return email;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTelefono(long telefono) {
        this.telefono = telefono;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
