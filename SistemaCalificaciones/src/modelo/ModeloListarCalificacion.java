package modelo;

public class ModeloListarCalificacion {

    ArchivoTexto objArchivoTexto;

    public Object[][] listar(String[] columnas) {

        this.objArchivoTexto = new ArchivoTexto();
        this.objArchivoTexto.abrirArchivoTexto('r', "calificaciones.txt");

        Object[][] datos = this.objArchivoTexto.obtenerMatrizLineas(columnas.length);

        this.objArchivoTexto.cerrarArchivo('r');

        return datos;
    }
}