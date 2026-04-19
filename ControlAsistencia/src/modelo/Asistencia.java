package modelo;

public class Asistencia {

    private String nombre;
    private String fecha;
    private String estado;

    public Asistencia() {
        this("", "", "");
    }

    public Asistencia(String nombre, String fecha, String estado) {
        this.nombre = nombre;
        this.fecha = fecha;
        this.estado = estado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return this.nombre + "," + this.fecha + "," + this.estado;
    }
}