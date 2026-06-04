package modelo;

public class ModeloRegistrarEstudiante {

    ArchivoTexto objArch;

    public ModeloRegistrarEstudiante() {
        objArch = new ArchivoTexto();
    }

    public void guardarEstudiante(String numControl, String nombre, String apellidos, String semestre, String grupo, String carrera) {
        ModeloEstudiante objModEst = new ModeloEstudiante();
        objModEst.setNumControl(numControl);
        objModEst.setNombre(nombre);
        objModEst.setApellidos(apellidos);
        objModEst.setSemestre(semestre);
        objModEst.setGrupo(grupo);

        objModEst.setCarrera(carrera);

        objArch.abrirArchivoTexto('w', "estudiantes.csv");
        objArch.crearLinea(objModEst.toString());
        objArch.cerrarArchivo('w');
    }

}
