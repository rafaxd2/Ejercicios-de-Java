package modelo;

public class Venta {
    private String fecha;
    private String producto;
    private int cantidad;
    private double total;

    public Venta(String fecha, String producto, int cantidad, double total) {
        this.fecha = fecha;
        this.producto = producto;
        this.cantidad = cantidad;
        this.total = total;
    }

    @Override
    public String toString() {
        return fecha + "," + producto + "," + cantidad + "," + total;
    }
}
