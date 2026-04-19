package modelo;

public class ModeloVenta {
    ArchivoTexto objArch = new ArchivoTexto();

    public void registrarVenta(String fec, String pro, int cant, double tot) {
        Venta v = new Venta(fec, pro, cant, tot);
        objArch.abrirArchivoTexto('w', "ventas.txt");
        objArch.crearLinea(v.toString());
        objArch.cerrarArchivo('w');
    }
}