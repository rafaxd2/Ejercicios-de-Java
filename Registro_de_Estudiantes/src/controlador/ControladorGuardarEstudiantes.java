package controlador;

import modelo.ArchivoTexto;
import modelo.Estudiante;

public class ControladorGuardarEstudiantes {
    ArchivoTexto objArch;

    public void guardarEstudiantes(String numControl, String nombre, String carrera, double promedio) {
        Estudiante objEst = new Estudiante(numControl, nombre, carrera, promedio);
        
        this.objArch = new ArchivoTexto();
        this.objArch.abrirArchivoTexto('w', "estudiantes.txt");
        this.objArch.crearLinea(objEst.toString());
        this.objArch.cerrarArchivo('w');
    }
}