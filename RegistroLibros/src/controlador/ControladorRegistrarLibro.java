package controlador;

import modelo.ModeloRegistrarLibro;

public class ControladorRegistrarLibro {

    ModeloRegistrarLibro objModelo;

    public ControladorRegistrarLibro() {
        this.objModelo = new ModeloRegistrarLibro();
    }

    public void registrar(String titulo, String autor, String anio) {
        this.objModelo.registrar(titulo, autor, anio);
    }
}