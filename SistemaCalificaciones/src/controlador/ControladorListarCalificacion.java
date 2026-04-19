package controlador;

import javax.swing.table.DefaultTableModel;
import modelo.ModeloListarCalificacion;
import vista.VistaCalificacion;

public class ControladorListarCalificacion {

    ModeloListarCalificacion objModelo;
    VistaCalificacion vista;

    public ControladorListarCalificacion(VistaCalificacion vista) {
        this.vista = vista;
        this.objModelo = new ModeloListarCalificacion();
    }

    public void listar(String[] columnas) {

        Object[][] datos = this.objModelo.listar(columnas);

        DefaultTableModel modelo = new DefaultTableModel(datos, columnas);

        vista.tblCalificaciones.setModel(modelo);
    }
}