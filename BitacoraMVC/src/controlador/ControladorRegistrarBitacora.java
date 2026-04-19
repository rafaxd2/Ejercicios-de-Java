package controlador;

import modelo.ModeloRegistrarBitacora;

public class ControladorRegistrarBitacora {

    ModeloRegistrarBitacora objModelo;

    public ControladorRegistrarBitacora() {
        this.objModelo = new ModeloRegistrarBitacora();
    }

    public void registrar(String fecha, String actividad) {
        this.objModelo.registrar(fecha, actividad);
    }
}