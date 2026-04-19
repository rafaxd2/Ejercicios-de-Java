package controlador;

import javax.swing.table.DefaultTableModel;
import modelo.ModeloListarAsistencia;
import vista.VistaAsistencia;

public class ControladorListarAsistencia {

    ModeloListarAsistencia objModelo;
    VistaAsistencia vista;

    public ControladorListarAsistencia(VistaAsistencia vista) {
        this.vista = vista;
        this.objModelo = new ModeloListarAsistencia();
    }

    public void listar(String[] columnas) {

        Object[][] datos = this.objModelo.listar(columnas);

        DefaultTableModel modelo = new DefaultTableModel(datos, columnas);

        vista.tblAsistencia.setModel(modelo);
    }
}