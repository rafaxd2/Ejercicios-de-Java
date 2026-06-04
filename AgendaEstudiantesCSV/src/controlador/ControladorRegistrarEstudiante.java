package controlador;
import modelo.ModeloRegistrarEstudiante;
import vista.VistaRegistrarEstudiante;

public class ControladorRegistrarEstudiante {
    ModeloRegistrarEstudiante objModRegEst;
    VistaRegistrarEstudiante objViewRegEst;

    public ControladorRegistrarEstudiante(VistaRegistrarEstudiante objViewRegEst) {
        this.objModRegEst = new ModeloRegistrarEstudiante();  
        this.objViewRegEst = objViewRegEst;
    }
    
    public void registrarEstudiante(
    String numControl,
    String nombre,
    String apellidos,
    String semestre,
    String grupo,
    String carrera){
    
    this.objModRegEst.guardarEstudiante (numControl, nombre,apellidos,semestre,grupo, carrera );
    }
  
}
