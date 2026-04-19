package modelo;

public class ModeloInventario {
    ArchivoTexto objArch = new ArchivoTexto();

    public void guardarProducto(String id, String nom, double pre, int cant) {
        Producto p = new Producto(id, nom, pre, cant);
        objArch.abrirArchivoTexto('w', "productos.txt");
        objArch.crearLinea(p.toString());
        objArch.cerrarArchivo('w');
    }
}