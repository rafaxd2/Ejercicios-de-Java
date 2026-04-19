package modelo;

public class Pedido {

    private String cliente;
    private String producto;
    private String cantidad;

    public Pedido() {
        this("", "", "");
    }

    public Pedido(String cliente, String producto, String cantidad) {
        this.cliente = cliente;
        this.producto = producto;
        this.cantidad = cantidad;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public String getCantidad() {
        return cantidad;
    }

    public void setCantidad(String cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return this.cliente + "," + this.producto + "," + this.cantidad;
    }
}