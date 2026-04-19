package modelo;

public class ModeloRegistrarCalificacion {

    ArchivoTexto objArch;

    public void registrar(String nombre, String materia, String calificacion) {

        Calificacion obj = new Calificacion();
        obj.setNombre(nombre);
        obj.setMateria(materia);
        obj.setCalificacion(calificacion);

        this.objArch = new ArchivoTexto();
        this.objArch.abrirArchivoTexto('w', "calificaciones.txt");
        this.objArch.crearLinea(obj.toString());
        this.objArch.cerrarArchivo('w');
    }
}