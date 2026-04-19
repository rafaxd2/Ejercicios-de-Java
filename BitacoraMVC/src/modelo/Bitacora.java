package modelo;

public class Bitacora {
    private String fecha;
    private String actividad;

    public Bitacora() {
        this("", "");
    }

    public Bitacora(String fecha, String actividad) {
        this.fecha = fecha;
        this.actividad = actividad;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getActividad() {
        return actividad;
    }

    public void setActividad(String actividad) {
        this.actividad = actividad;
    }

    @Override
    public String toString() {
        return this.fecha + "," + this.actividad;
    }
}