package modelo;

public class ModeloRegistrarPedido {

    ArchivoTexto objArch;

    public void registrar(String cliente, String producto, String cantidad) {

        Pedido obj = new Pedido();
        obj.setCliente(cliente);
        obj.setProducto(producto);
        obj.setCantidad(cantidad);

        this.objArch = new ArchivoTexto();
        this.objArch.abrirArchivoTexto('w', "pedidos.txt");
        this.objArch.crearLinea(obj.toString());
        this.objArch.cerrarArchivo('w');
    }
}