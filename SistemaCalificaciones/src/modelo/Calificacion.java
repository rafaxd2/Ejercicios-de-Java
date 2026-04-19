package modelo;

public class Calificacion {

    private String nombre;
    private String materia;
    private String calificacion;

    public Calificacion() {
        this("", "", "");
    }

    public Calificacion(String nombre, String materia, String calificacion) {
        this.nombre = nombre;
        this.materia = materia;
        this.calificacion = calificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public String getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(String calificacion) {
        this.calificacion = calificacion;
    }

    @Override
    public String toString() {
        return this.nombre + "," + this.materia + "," + this.calificacion;
    }
}