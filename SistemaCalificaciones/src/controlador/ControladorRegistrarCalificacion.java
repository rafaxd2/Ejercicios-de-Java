package controlador;

import modelo.ModeloRegistrarCalificacion;

public class ControladorRegistrarCalificacion {

    ModeloRegistrarCalificacion objModelo;

    public ControladorRegistrarCalificacion() {
        this.objModelo = new ModeloRegistrarCalificacion();
    }

    public void registrar(String nombre, String materia, String calificacion) {
        this.objModelo.registrar(nombre, materia, calificacion);
    }
}