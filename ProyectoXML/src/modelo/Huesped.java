package modelo;

public class Huesped {

    private int id;
    private String nombre;
    private String apellidos;
    private String procedencia;

    public Huesped(int id,
            String nombre,
            String apellidos,
            String procedencia) {

        this.id = id;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.procedencia = procedencia;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getProcedencia() {
        return procedencia;
    }
}