package modelo;

public class Contacto {
    private String nombre;
    private String telefono;
    private String email;

    public Contacto(String nombre, String telefono, String email) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.email = email;
    }

    // El método toString es vital para guardar en el archivo .txt
    @Override
    public String toString() {
        return nombre + "," + telefono + "," + email;
    }
}