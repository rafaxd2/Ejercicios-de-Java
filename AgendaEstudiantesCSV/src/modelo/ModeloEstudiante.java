package modelo;

public class ModeloEstudiante {

    String numControl;
    String nombre;
    String apellidos;
    String semestre;
    String grupo;
    String carrera;

    public ModeloEstudiante(String numControl, String nombre, String apellidos, String semestre, String grupo, String carrera) {
        this.numControl = numControl;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.semestre = semestre;
        this.grupo = grupo;
        this.carrera = carrera;
    }
    
    
    public ModeloEstudiante() {
        this("","","","","","");
    }


    public String getNumControl() {
        return numControl;
    }

    public void setNumControl(String numControl) {
        this.numControl = numControl;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getSemestre() {
        return semestre;
    }

    public void setSemestre(String semestre) {
        this.semestre = semestre;
    }

    public String getGrupo() {
        return grupo;
    }

    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    @Override
    public String toString() {
        return this.getNumControl() + ","
                + this.getNombre() + ","
                + this.getApellidos() + ", "
                + this.getSemestre() + ", "
                + this.getGrupo() + ", "
                + this.getCarrera();
    }

}
