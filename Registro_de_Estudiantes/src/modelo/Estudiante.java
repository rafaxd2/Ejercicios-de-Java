package modelo;

public class Estudiante {

    private String numControl;
    private String nombre;
    private String carrera;
    private double promedio;

    public Estudiante(String numControl, String nombre, String carrera, double promedio) {
        this.numControl = numControl;
        this.nombre = nombre;
        this.carrera = carrera;
        this.promedio = promedio;
    }

    public String getNumControl() {
        return numControl;
    }

    public void setNumControl(String numControl) {
        this.numControl = numControl;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }

    @Override
    public String toString() {
        return this.getNumControl() + ","
                + this.getNombre() + ","
                + this.getCarrera() + ","
                + this.getPromedio();
    }
}
