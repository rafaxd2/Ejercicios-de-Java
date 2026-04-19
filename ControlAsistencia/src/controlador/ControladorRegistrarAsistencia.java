package controlador;

import modelo.ModeloRegistrarAsistencia;

public class ControladorRegistrarAsistencia {

    ModeloRegistrarAsistencia objModelo;

    public ControladorRegistrarAsistencia() {
        this.objModelo = new ModeloRegistrarAsistencia();
    }

    public void registrar(String nombre, String fecha, String estado) {
        this.objModelo.registrar(nombre, fecha, estado);
    }
}