package modelo;

public class ModeloRegistrarAsistencia {

    ArchivoTexto objArch;

    public void registrar(String nombre, String fecha, String estado) {

        Asistencia obj = new Asistencia();
        obj.setNombre(nombre);
        obj.setFecha(fecha);
        obj.setEstado(estado);

        this.objArch = new ArchivoTexto();
        this.objArch.abrirArchivoTexto('w', "asistencia.txt");
        this.objArch.crearLinea(obj.toString());
        this.objArch.cerrarArchivo('w');
    }
}