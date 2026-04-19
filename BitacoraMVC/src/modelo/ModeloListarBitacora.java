package modelo;

public class ModeloListarBitacora {

    ArchivoTexto objArchivoTexto;

    public Object[][] listar(String[] columnas) {

        this.objArchivoTexto = new ArchivoTexto();
        this.objArchivoTexto.abrirArchivoTexto('r', "bitacora.txt");

        Object[][] datos = this.objArchivoTexto.obtenerMatrizLineas(columnas.length);

        this.objArchivoTexto.cerrarArchivo('r');

        return datos;
    }
}