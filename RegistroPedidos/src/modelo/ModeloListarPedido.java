package modelo;

public class ModeloListarPedido {

    ArchivoTexto objArchivoTexto;

    public Object[][] listar(String[] columnas) {

        this.objArchivoTexto = new ArchivoTexto();
        this.objArchivoTexto.abrirArchivoTexto('r', "pedidos.txt");

        Object[][] datos = this.objArchivoTexto.obtenerMatrizLineas(columnas.length);

        this.objArchivoTexto.cerrarArchivo('r');

        return datos;
    }
}