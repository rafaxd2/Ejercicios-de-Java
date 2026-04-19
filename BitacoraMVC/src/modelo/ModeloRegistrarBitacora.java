package modelo;

public class ModeloRegistrarBitacora {

    ArchivoTexto objArch;

    public void registrar(String fecha, String actividad) {

        Bitacora obj = new Bitacora();
        obj.setFecha(fecha);
        obj.setActividad(actividad);

        this.objArch = new ArchivoTexto();
        this.objArch.abrirArchivoTexto('w', "bitacora.txt");
        this.objArch.crearLinea(obj.toString());
        this.objArch.cerrarArchivo('w');
    }
}